package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mz8  reason: default package */
/* loaded from: classes.dex */
public final class mz8 extends rl9 {
    public final TextView t;
    public final View u;

    public mz8(View view) {
        super(view);
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.t = (TextView) view.findViewById(R.id.exo_text);
        this.u = view.findViewById(R.id.exo_check);
    }
}
