package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j13  reason: default package */
/* loaded from: classes.dex */
public final class j13 implements un3 {
    public final int a;
    public final int b;

    public j13(int i, int i2) {
        boolean z;
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mv5.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
    }

    @Override // defpackage.un3
    public final void a(lu0 lu0Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = lu0Var.b;
                if (i5 > i4) {
                    char c = lu0Var.c((i5 - i4) - 1);
                    char c2 = lu0Var.c(lu0Var.b - i4);
                    if (Character.isHighSurrogate(c) && Character.isLowSurrogate(c2)) {
                        i3 += 2;
                    } else {
                        i3 = i4;
                    }
                    i2++;
                } else {
                    i3 = i5;
                    break;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = lu0Var.c;
            cw cwVar = (cw) lu0Var.f;
            if (i8 + i7 < cwVar.e()) {
                char c3 = lu0Var.c((lu0Var.c + i7) - 1);
                char c4 = lu0Var.c(lu0Var.c + i7);
                if (Character.isHighSurrogate(c3) && Character.isLowSurrogate(c4)) {
                    i6 += 2;
                } else {
                    i6 = i7;
                }
                i++;
            } else {
                i6 = cwVar.e() - lu0Var.c;
                break;
            }
        }
        int i9 = lu0Var.c;
        lu0Var.a(i9, i6 + i9);
        int i10 = lu0Var.b;
        lu0Var.a(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j13)) {
            return false;
        }
        j13 j13Var = (j13) obj;
        if (this.a == j13Var.a && this.b == j13Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return hl5.i(this.a, this.b, "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ")");
    }
}
