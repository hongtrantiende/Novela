package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vbook.android.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ez8  reason: default package */
/* loaded from: classes.dex */
public final class ez8 extends yk9 {
    public List c = new ArrayList();
    public final /* synthetic */ qz8 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ qz8 f;

    public ez8(qz8 qz8Var, int i) {
        this.e = i;
        this.f = qz8Var;
        this.d = qz8Var;
    }

    @Override // defpackage.yk9
    public final int a() {
        if (this.c.isEmpty()) {
            return 0;
        }
        return this.c.size() + 1;
    }

    @Override // defpackage.yk9
    public /* bridge */ /* synthetic */ void b(rl9 rl9Var, int i) {
        switch (this.e) {
            case 1:
                f((mz8) rl9Var, i);
                return;
            default:
                f((mz8) rl9Var, i);
                return;
        }
    }

    @Override // defpackage.yk9
    public final rl9 c(ViewGroup viewGroup) {
        return new mz8(LayoutInflater.from(this.d.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    public boolean d(kjc kjcVar) {
        for (int i = 0; i < this.c.size(); i++) {
            if (kjcVar.v.containsKey(((nz8) this.c.get(i)).a.b)) {
                return true;
            }
        }
        return false;
    }

    public void e(List list) {
        Drawable drawable;
        String str;
        qz8 qz8Var = this.f;
        ImageView imageView = qz8Var.c0;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= ((mm9) list).d) {
                break;
            }
            nz8 nz8Var = (nz8) ((mm9) list).get(i);
            if (nz8Var.a.e[nz8Var.b]) {
                z = true;
                break;
            }
            i++;
        }
        if (imageView != null) {
            if (z) {
                drawable = qz8Var.E0;
            } else {
                drawable = qz8Var.F0;
            }
            imageView.setImageDrawable(drawable);
            if (z) {
                str = qz8Var.G0;
            } else {
                str = qz8Var.H0;
            }
            imageView.setContentDescription(str);
        }
        this.c = list;
    }

    public void f(mz8 mz8Var, int i) {
        int i2;
        switch (this.e) {
            case 1:
                g(mz8Var, i);
                if (i > 0) {
                    nz8 nz8Var = (nz8) this.c.get(i - 1);
                    View view = mz8Var.u;
                    sjc sjcVar = nz8Var.a;
                    if (sjcVar.e[nz8Var.b]) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                    view.setVisibility(i2);
                    return;
                }
                return;
            default:
                g(mz8Var, i);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r9.a.e[r9.b] != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.mz8 r8, int r9) {
        /*
            r7 = this;
            qz8 r0 = r7.d
            cz8 r0 = r0.M0
            if (r0 != 0) goto L7
            return
        L7:
            r1 = 4
            r2 = 0
            r3 = 1
            if (r9 != 0) goto L7a
            int r9 = r7.e
            switch(r9) {
                case 0: goto L4d;
                default: goto L11;
            }
        L11:
            android.widget.TextView r9 = r8.t
            r0 = 2131951779(0x7f1300a3, float:1.9539982E38)
            r9.setText(r0)
            r9 = r2
        L1a:
            java.util.List r0 = r7.c
            int r0 = r0.size()
            if (r9 >= r0) goto L39
            java.util.List r0 = r7.c
            java.lang.Object r0 = r0.get(r9)
            nz8 r0 = (defpackage.nz8) r0
            sjc r4 = r0.a
            int r0 = r0.b
            boolean[] r4 = r4.e
            boolean r0 = r4[r0]
            if (r0 == 0) goto L36
            r3 = r2
            goto L39
        L36:
            int r9 = r9 + 1
            goto L1a
        L39:
            android.view.View r9 = r8.u
            if (r3 == 0) goto L3e
            r1 = r2
        L3e:
            r9.setVisibility(r1)
            android.view.View r8 = r8.a
            dz8 r9 = new dz8
            r0 = 3
            r9.<init>(r7, r0)
            r8.setOnClickListener(r9)
            goto L79
        L4d:
            android.widget.TextView r9 = r8.t
            r0 = 2131951778(0x7f1300a2, float:1.953998E38)
            r9.setText(r0)
            qz8 r9 = r7.f
            cz8 r9 = r9.M0
            r9.getClass()
            i04 r9 = (defpackage.i04) r9
            kjc r9 = r9.u()
            boolean r9 = r7.d(r9)
            android.view.View r0 = r8.u
            if (r9 == 0) goto L6b
            goto L6c
        L6b:
            r1 = r2
        L6c:
            r0.setVisibility(r1)
            android.view.View r8 = r8.a
            dz8 r9 = new dz8
            r9.<init>(r7, r3)
            r8.setOnClickListener(r9)
        L79:
            return
        L7a:
            java.util.List r4 = r7.c
            int r9 = r9 - r3
            java.lang.Object r9 = r4.get(r9)
            nz8 r9 = (defpackage.nz8) r9
            sjc r4 = r9.a
            ajc r4 = r4.b
            r5 = r0
            i04 r5 = (defpackage.i04) r5
            kjc r5 = r5.u()
            rm9 r5 = r5.v
            java.lang.Object r5 = r5.get(r4)
            if (r5 == 0) goto La1
            sjc r5 = r9.a
            int r6 = r9.b
            boolean[] r5 = r5.e
            boolean r5 = r5[r6]
            if (r5 == 0) goto La1
            goto La2
        La1:
            r3 = r2
        La2:
            android.widget.TextView r5 = r8.t
            java.lang.String r6 = r9.c
            r5.setText(r6)
            android.view.View r5 = r8.u
            if (r3 == 0) goto Lae
            r1 = r2
        Lae:
            r5.setVisibility(r1)
            android.view.View r8 = r8.a
            oz8 r1 = new oz8
            r1.<init>()
            r8.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez8.g(mz8, int):void");
    }

    private final void h(String str) {
    }
}
