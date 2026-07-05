package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ooc  reason: default package */
/* loaded from: classes.dex */
public final class ooc {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(fjc fjcVar, ejc ejcVar) {
        if (this.c > 0) {
            fjcVar.a(this.d, this.e, this.f, this.g, ejcVar);
            this.c = 0;
        }
    }

    public final void b(fjc fjcVar, long j, int i, int i2, int i3, ejc ejcVar) {
        boolean z;
        if (this.g <= i2 + i3) {
            z = true;
        } else {
            z = false;
        }
        wq9.C("TrueHD chunk samples must be contiguous in the sample queue.", z);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(fjcVar, ejcVar);
            }
        }
    }

    public final void c(s94 s94Var) {
        char c;
        if (!this.b) {
            byte[] bArr = this.a;
            int i = 0;
            s94Var.x(bArr, 0, 10);
            s94Var.p();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b = bArr[7];
                if ((b & 254) == 186) {
                    if ((b & 255) == 187) {
                        i = 1;
                    }
                    if (i != 0) {
                        c = '\t';
                    } else {
                        c = '\b';
                    }
                    i = 40 << ((bArr[c] >> 4) & 7);
                }
            }
            if (i == 0) {
                return;
            }
            this.b = true;
        }
    }
}
