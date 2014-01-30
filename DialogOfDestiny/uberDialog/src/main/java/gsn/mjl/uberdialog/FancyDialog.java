package gsn.mjl.uberdialog;

import android.app.Dialog;
import android.content.Context;

public class FancyDialog extends Dialog {

    public FancyDialog(Context context) {
        super(context, android.R.style.Theme_DeviceDefault_Light_Dialog);
        setContentView(R.layout.dialog_fancy);
        this.setTitle("Select desired rent range");
    }
}
