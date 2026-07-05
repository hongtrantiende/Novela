package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jvb  reason: default package */
/* loaded from: classes.dex */
public final class jvb {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final ArrayList h;

    public jvb(int i, int i2, float f, float f2, float f3, float f4, float f5, ArrayList arrayList) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jvb) {
                jvb jvbVar = (jvb) obj;
                if (this.a != jvbVar.a || this.b != jvbVar.b || Float.compare(this.c, jvbVar.c) != 0 || Float.compare(this.d, jvbVar.d) != 0 || Float.compare(this.e, jvbVar.e) != 0 || Float.compare(this.f, jvbVar.f) != 0 || Float.compare(this.g, jvbVar.g) != 0 || !this.h.equals(jvbVar.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.h.hashCode() + nk2.d(this.g, nk2.d(this.f, nk2.d(this.e, nk2.d(this.d, nk2.d(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "TextLine(start=", ", end=", ", x=");
        s21.D(r, this.c, ", y=", this.d, ", width=");
        s21.D(r, this.e, ", height=", this.f, ", baseLine=");
        r.append(this.g);
        r.append(", chars=");
        r.append(this.h);
        r.append(")");
        return r.toString();
    }
}
