package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yod  reason: default package */
/* loaded from: classes3.dex */
public final class yod {
    public final int a;
    public final int b;
    public final int c;

    public yod(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yod.class != obj.getClass()) {
            return false;
        }
        yod yodVar = (yod) obj;
        if (this.a == yodVar.a && this.b == yodVar.b && this.c == yodVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        if (i >= 0) {
            sb.append(i);
            int i2 = this.a;
            if (i2 >= 0) {
                sb.append(':');
                sb.append(i2);
            }
        } else {
            int i3 = this.c;
            if (i3 >= 0) {
                sb.append('@');
                sb.append(i3);
            } else {
                sb.append("<unknown>");
            }
        }
        return sb.toString();
    }
}
