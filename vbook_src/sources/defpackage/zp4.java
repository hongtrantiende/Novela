package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zp4  reason: default package */
/* loaded from: classes.dex */
public final class zp4 implements yp4 {
    public final float a;

    public zp4(float f) {
        this.a = f;
    }

    @Override // defpackage.yp4
    public final String a() {
        return "ital";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zp4) && this.a == ((zp4) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a) + 100522026;
    }

    public final String toString() {
        return a82.k("FontVariation.Setting(axisName='ital', value=", this.a, ")");
    }
}
