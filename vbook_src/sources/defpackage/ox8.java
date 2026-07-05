package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ox8  reason: default package */
/* loaded from: classes.dex */
public final class ox8 {
    public static final ox8 c = new ox8(0, false);
    public final boolean a;
    public final int b;

    public ox8() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox8)) {
            return false;
        }
        ox8 ox8Var = (ox8) obj;
        if (this.a == ox8Var.a && this.b == ox8Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        String a = ur3.a(this.b);
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + a + ")";
    }

    public ox8(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
