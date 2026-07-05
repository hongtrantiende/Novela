package defpackage;

import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vf9  reason: default package */
/* loaded from: classes.dex */
public final class vf9 {
    public static final vf9 d = new vf9(0, 0, 0);
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public vf9(int i) {
        this.a = 12;
        this.b = 2;
        this.c = i;
    }

    public int a() {
        int i = this.c;
        if (i != 2) {
            if (i != 5) {
                if (i != 29) {
                    if (i != 42) {
                        if (i != 22) {
                            if (i != 23) {
                                return 0;
                            }
                            return 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    public void b(rl9 rl9Var) {
        View view = rl9Var.a;
        this.b = view.getLeft();
        this.c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(vf9.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return rs8.g(this.c, "]", sb);
            case 8:
                StringBuilder sb2 = new StringBuilder("MutableRange(start=");
                sb2.append(this.b);
                sb2.append(", end=");
                return hl5.p(sb2, this.c, ')');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ vf9(int i, byte b) {
        this.a = i;
    }

    public /* synthetic */ vf9(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
