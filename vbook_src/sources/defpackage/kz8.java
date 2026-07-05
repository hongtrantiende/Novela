package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kz8  reason: default package */
/* loaded from: classes.dex */
public final class kz8 extends rl9 {
    public final TextView t;
    public final TextView u;
    public final ImageView v;
    public final /* synthetic */ qz8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz8(qz8 qz8Var, View view) {
        super(view);
        this.w = qz8Var;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.t = (TextView) view.findViewById(R.id.exo_main_text);
        this.u = (TextView) view.findViewById(R.id.exo_sub_text);
        this.v = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new dz8(this, 2));
    }
}
