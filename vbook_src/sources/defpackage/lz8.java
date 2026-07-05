package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lz8  reason: default package */
/* loaded from: classes.dex */
public final class lz8 extends yk9 {
    public final String[] c;
    public final String[] d;
    public final Drawable[] e;
    public final /* synthetic */ qz8 f;

    public lz8(qz8 qz8Var, String[] strArr, Drawable[] drawableArr) {
        this.f = qz8Var;
        this.c = strArr;
        this.d = new String[strArr.length];
        this.e = drawableArr;
    }

    @Override // defpackage.yk9
    public final int a() {
        return this.c.length;
    }

    @Override // defpackage.yk9
    public final void b(rl9 rl9Var, int i) {
        kz8 kz8Var = (kz8) rl9Var;
        boolean d = d(i);
        View view = kz8Var.a;
        if (d) {
            view.setLayoutParams(new fl9(-1, -2));
        } else {
            view.setLayoutParams(new fl9(0, 0));
        }
        kz8Var.t.setText(this.c[i]);
        String str = this.d[i];
        TextView textView = kz8Var.u;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.e[i];
        ImageView imageView = kz8Var.v;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // defpackage.yk9
    public final rl9 c(ViewGroup viewGroup) {
        qz8 qz8Var = this.f;
        return new kz8(qz8Var, LayoutInflater.from(qz8Var.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }

    public final boolean d(int i) {
        qz8 qz8Var = this.f;
        cz8 cz8Var = qz8Var.M0;
        if (cz8Var != null) {
            if (i != 0) {
                if (i != 1 || (((i04) cz8Var).v(30) && ((i04) qz8Var.M0).v(29))) {
                    return true;
                }
                return false;
            }
            return ((i04) cz8Var).v(13);
        }
        return false;
    }
}
