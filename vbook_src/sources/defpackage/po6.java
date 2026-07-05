package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: po6  reason: default package */
/* loaded from: classes.dex */
public final class po6 {
    public static final float b;
    public static final float c;
    public static final float d;
    public final float a;

    static {
        a(nae.e);
        a(0.5f);
        b = 0.5f;
        a(-1.0f);
        c = -1.0f;
        a(1.0f);
        d = 1.0f;
    }

    public /* synthetic */ po6(float f) {
        this.a = f;
    }

    public static void a(float f) {
        if ((nae.e <= f && f <= 1.0f) || f == -1.0f) {
            return;
        }
        mv5.c("topRatio should be in [0..1] range or -1");
    }

    public static String b(float f) {
        if (f == nae.e) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return a82.k("LineHeightStyle.Alignment(topPercentage = ", f, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof po6) {
            if (Float.compare(this.a, ((po6) obj).a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
