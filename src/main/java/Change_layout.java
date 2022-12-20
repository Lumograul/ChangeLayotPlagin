import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import java.io.UnsupportedEncodingException;

public class Change_layout extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        // Get all the required data from data keys
        Editor editor = event.getRequiredData(CommonDataKeys.EDITOR);
        Project project = event.getRequiredData(CommonDataKeys.PROJECT);
        Document document = editor.getDocument();

        // Work off of the primary caret to get the selection info
        Caret primaryCaret = editor.getCaretModel().getPrimaryCaret();
        int start = primaryCaret.getSelectionStart();
        int end = primaryCaret.getSelectionEnd();

        String selectedText = editor.getSelectionModel().getSelectedText();

        String changedText = null;
        try {
            changedText = ReplaceFromRusToEng.Replace(selectedText);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        // Replace the selection with a fixed string.
        // Must do this document change in a write action context.
        String finalChangedText = changedText;
        WriteCommandAction.runWriteCommandAction(project, () ->
                document.replaceString(start, end, finalChangedText)
        );

        // De-select the text range that was just replaced
        primaryCaret.removeSelection();
    }

    @Override
    public boolean isDumbAware() {
        return super.isDumbAware();
    }
}
