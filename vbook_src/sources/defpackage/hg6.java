package defpackage;

import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hg6  reason: default package */
/* loaded from: classes.dex */
public final class hg6 {
    public final /* synthetic */ int a;
    public final em8 b;
    public final em8 c;
    public boolean d;
    public Object e;
    public final xh6 f;

    public hg6(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new em8(i);
                this.c = new em8(i2);
                this.f = new xh6(i, 30, 100);
                return;
            default:
                this.b = new em8(i);
                this.c = new em8(i2);
                this.f = new xh6(i, 90, Context.VERSION_ES6);
                return;
        }
    }

    public final void a(int i, int i2) {
        int i3 = this.a;
        em8 em8Var = this.c;
        xh6 xh6Var = this.f;
        em8 em8Var2 = this.b;
        switch (i3) {
            case 0:
                if (i < nae.e) {
                    ov5.a("Index should be non-negative");
                }
                em8Var2.i(i);
                xh6Var.a(i);
                em8Var.i(i2);
                return;
            default:
                if (i < nae.e) {
                    ov5.a("Index should be non-negative (" + i + ")");
                }
                em8Var2.i(i);
                xh6Var.a(i);
                em8Var.i(i2);
                return;
        }
    }
}
