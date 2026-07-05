package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: zhc  reason: default package */
/* loaded from: classes3.dex */
public final class zhc implements lz7 {
    public static final yhc Companion = new Object();
    public final int a;
    public final Integer b;

    public /* synthetic */ zhc(int i, int i2, Integer num) {
        if (1 == (i & 1)) {
            this.a = i2;
            if ((i & 2) == 0) {
                this.b = null;
                return;
            } else {
                this.b = num;
                return;
            }
        }
        w92.x(i, 1, xhc.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhc)) {
            return false;
        }
        zhc zhcVar = (zhc) obj;
        if (this.a == zhcVar.a && c16.i(this.b, zhcVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "TopicEditorRoute(category=" + this.a + ", topicId=" + this.b + ")";
    }

    public zhc(int i, Integer num) {
        this.a = i;
        this.b = num;
    }
}
