package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i7  reason: default package */
/* loaded from: classes.dex */
public final class i7 {
    public int a;
    public int b;
    public int c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i7) {
                i7 i7Var = (i7) obj;
                int i = this.a;
                if (i == i7Var.a) {
                    if (i != 8 || Math.abs(this.c - this.b) != 1 || this.c != i7Var.b || this.b != i7Var.c) {
                        if (this.c == i7Var.c && this.b == i7Var.b) {
                            return true;
                        }
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        return rs8.g(this.c, ",p:null]", sb);
    }
}
