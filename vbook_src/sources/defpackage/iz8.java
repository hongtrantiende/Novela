package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iz8  reason: default package */
/* loaded from: classes.dex */
public final class iz8 extends yk9 {
    public final String[] c;
    public final float[] d;
    public int e;
    public final /* synthetic */ qz8 f;

    public iz8(qz8 qz8Var, String[] strArr, float[] fArr) {
        this.f = qz8Var;
        this.c = strArr;
        this.d = fArr;
    }

    @Override // defpackage.yk9
    public final int a() {
        return this.c.length;
    }

    @Override // defpackage.yk9
    public final void b(rl9 rl9Var, final int i) {
        mz8 mz8Var = (mz8) rl9Var;
        View view = mz8Var.u;
        View view2 = mz8Var.a;
        String[] strArr = this.c;
        if (i < strArr.length) {
            mz8Var.t.setText(strArr[i]);
        }
        if (i == this.e) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: hz8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                iz8 iz8Var = iz8.this;
                qz8 qz8Var = iz8Var.f;
                int i2 = iz8Var.e;
                int i3 = i;
                if (i3 != i2) {
                    qz8Var.setPlaybackSpeed(iz8Var.d[i3]);
                }
                qz8Var.N.dismiss();
            }
        });
    }

    @Override // defpackage.yk9
    public final rl9 c(ViewGroup viewGroup) {
        return new mz8(LayoutInflater.from(this.f.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
