package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hka  reason: default package */
/* loaded from: classes3.dex */
public final class hka {
    public final xu5 a;
    public final List b;
    public final List c;

    public hka(xu5 xu5Var, List list, List list2) {
        this.a = xu5Var;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hka) {
                hka hkaVar = (hka) obj;
                if (!this.a.equals(hkaVar.a) || Float.compare(15.0f, 15.0f) != 0 || !this.b.equals(hkaVar.b) || !this.c.equals(hkaVar.c) || !rg3.b(400.0f, 400.0f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(400.0f) + eub.l(eub.l(nk2.d(15.0f, hl5.a(6, this.a.hashCode() * 31, 31), 31), this.b, 31), this.c, 31);
    }

    public final String toString() {
        String a = vl0.a(6);
        String c = rg3.c(400.0f);
        StringBuilder sb = new StringBuilder("ShimmerTheme(animationSpec=");
        sb.append(this.a);
        sb.append(", blendMode=");
        sb.append(a);
        sb.append(", rotation=15.0, shaderColors=");
        sb.append(this.b);
        sb.append(", shaderColorStops=");
        sb.append(this.c);
        sb.append(", shimmerWidth=");
        return s21.q(sb, c, ")");
    }
}
