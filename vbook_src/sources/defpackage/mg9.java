package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mg9  reason: default package */
/* loaded from: classes.dex */
public final class mg9 implements lg9 {
    public final String a;
    public final gid b;
    public final kg9 c;
    public final fud d;
    public final fud e;
    public final fud f;
    public final float[] g;
    public final float[] h;

    public mg9(String str, gid gidVar, kg9 kg9Var, fud fudVar, fud fudVar2, fud fudVar3, lu4 lu4Var) {
        gidVar.getClass();
        fudVar.getClass();
        fudVar2.getClass();
        fudVar3.getClass();
        this.a = str;
        this.b = gidVar;
        this.c = kg9Var;
        this.d = fudVar;
        this.e = fudVar2;
        this.f = fudVar3;
        tm1.a("RGB");
        fud fudVar4 = og9.a;
        float f = fudVar.a;
        float f2 = fudVar2.a;
        float f3 = fudVar3.a;
        float f4 = fudVar.b;
        float f5 = fudVar2.b;
        float f6 = fudVar3.b;
        float[] fArr = {f, f2, f3, f4, f5, f6, (1.0f - f) - f4, (1.0f - f2) - f5, (1.0f - f3) - f6};
        fud fudVar5 = gidVar.b;
        float[] w = nye.w(fArr);
        float f7 = fudVar5.a;
        float f8 = fudVar5.c;
        float f9 = (f7 * f8) / fudVar5.b;
        float a = fudVar5.a();
        float[] s = nye.s((w[2] * a) + (w[1] * f8) + (w[0] * f9), (w[5] * a) + (w[4] * f8) + (w[3] * f9), (w[8] * a) + (w[7] * f8) + (w[6] * f9), fArr);
        this.g = s;
        this.h = nye.w(s);
    }

    @Override // defpackage.lg9
    public final float[] a() {
        return this.g;
    }

    @Override // defpackage.lg9
    public final float[] b() {
        return this.h;
    }

    @Override // defpackage.lg9
    public final ig9 c(float f, float f2, float f3, float f4) {
        return new ig9(f, f2, f3, f4, this);
    }

    @Override // defpackage.iid
    public final gid d() {
        return this.b;
    }

    @Override // defpackage.lg9
    public final kg9 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lg9) {
                lg9 lg9Var = (lg9) obj;
                if (this.a.equals(lg9Var.getName()) && c16.i(this.b, lg9Var.d()) && this.c.equals(lg9Var.e())) {
                    if (obj instanceof mg9) {
                        mg9 mg9Var = (mg9) obj;
                        if (!c16.i(this.d, mg9Var.d) || !c16.i(this.e, mg9Var.e) || !c16.i(this.f, mg9Var.f)) {
                            return false;
                        }
                        return true;
                    } else if (!Arrays.equals(this.g, lg9Var.a()) || !Arrays.equals(this.h, lg9Var.b())) {
                        return false;
                    } else {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.iid
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        return this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return this.a;
    }
}
