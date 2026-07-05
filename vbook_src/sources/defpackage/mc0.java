package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mc0  reason: default package */
/* loaded from: classes.dex */
public final class mc0 extends x84 {
    public final Integer a;

    public mc0(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x84)) {
            return false;
        }
        Integer num = this.a;
        mc0 mc0Var = (mc0) ((x84) obj);
        if (num == null) {
            if (mc0Var.a == null) {
                return true;
            }
            return false;
        }
        return num.equals(mc0Var.a);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
