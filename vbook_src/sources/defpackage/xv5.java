package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xv5  reason: default package */
/* loaded from: classes.dex */
public final class xv5 {
    public final /* synthetic */ int a;
    public final u95 b;
    public final u95 c;
    public final u95 d;
    public final u95 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public xv5(xv5[] xv5VarArr) {
        this.a = 0;
        this.f = xv5VarArr;
        int length = xv5VarArr.length;
        u95[] u95VarArr = new u95[length];
        for (int i = 0; i < length; i++) {
            u95VarArr[i] = ((xv5[]) this.f)[i].b();
        }
        this.b = new u95(1, new p5d(u95VarArr, 0));
        int length2 = ((xv5[]) this.f).length;
        u95[] u95VarArr2 = new u95[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            u95VarArr2[i2] = ((xv5[]) this.f)[i2].d();
        }
        this.c = new u95(0, new t95(u95VarArr2, 0));
        int length3 = ((xv5[]) this.f).length;
        u95[] u95VarArr3 = new u95[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            u95VarArr3[i3] = ((xv5[]) this.f)[i3].c();
        }
        this.d = new u95(1, new p5d(u95VarArr3, 1));
        int length4 = ((xv5[]) this.f).length;
        u95[] u95VarArr4 = new u95[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            u95VarArr4[i4] = ((xv5[]) this.f)[i4].a();
        }
        this.e = new u95(0, new t95(u95VarArr4, 1));
    }

    public final u95 a() {
        int i = this.a;
        return this.e;
    }

    public final u95 b() {
        int i = this.a;
        return this.b;
    }

    public final u95 c() {
        int i = this.a;
        return this.d;
    }

    public final u95 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                return b00.s0((xv5[]) serializable, null, "innermostOf(", ")", null, 57);
            default:
                String str = (String) serializable;
                if (str != null) {
                    return hl5.n("RectRulers(", str, ")");
                }
                return super.toString();
        }
    }

    public xv5(String str) {
        this.a = 1;
        this.f = str;
        this.b = new u95(1, null);
        this.c = new u95(0, null);
        this.d = new u95(1, null);
        this.e = new u95(0, null);
    }
}
