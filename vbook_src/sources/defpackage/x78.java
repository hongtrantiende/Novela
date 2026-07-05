package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x78  reason: default package */
/* loaded from: classes.dex */
public final class x78 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final byte m;
    public final byte n;
    public final byte o;

    public x78(w78 w78Var) {
        boolean z;
        int i = w78Var.a;
        ByteBuffer byteBuffer = w78Var.b;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        ea1 ea1Var = new ea1(bArr, remaining);
        this.g = ea1Var.g(3);
        ea1Var.n();
        boolean f = ea1Var.f();
        this.a = f;
        if (f) {
            ea1Var.g(5);
            this.b = false;
            this.h = false;
        } else {
            if (ea1Var.f()) {
                ea1Var.o(64);
                if (ea1Var.f()) {
                    int i2 = 0;
                    while (!ea1Var.f()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        ea1Var.o(i2);
                    }
                }
                boolean f2 = ea1Var.f();
                this.b = f2;
                if (f2) {
                    ea1Var.o(47);
                }
            } else {
                this.b = false;
            }
            this.h = ea1Var.f();
            int g = ea1Var.g(5);
            for (int i3 = 0; i3 <= g; i3++) {
                ea1Var.o(12);
                if (i3 == 0) {
                    if (ea1Var.g(5) > 7) {
                        ea1Var.f();
                    }
                } else if (ea1Var.g(5) > 7) {
                    ea1Var.n();
                }
                if (this.b) {
                    ea1Var.n();
                }
                if (this.h && ea1Var.f()) {
                    if (i3 == 0) {
                        ea1Var.g(4);
                    } else {
                        ea1Var.o(4);
                    }
                }
            }
        }
        int g2 = ea1Var.g(4);
        int g3 = ea1Var.g(4);
        ea1Var.o(g2 + 1);
        ea1Var.o(g3 + 1);
        if (!this.a) {
            this.c = ea1Var.f();
        } else {
            this.c = false;
        }
        if (this.c) {
            ea1Var.o(4);
            ea1Var.o(3);
        }
        ea1Var.o(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            ea1Var.o(4);
            boolean f3 = ea1Var.f();
            if (f3) {
                ea1Var.o(2);
            }
            if (ea1Var.f()) {
                this.d = true;
            } else {
                this.d = ea1Var.f();
            }
            if (this.d) {
                if (ea1Var.f()) {
                    this.e = true;
                } else {
                    this.e = ea1Var.f();
                }
            } else {
                this.e = true;
            }
            if (f3) {
                this.f = ea1Var.g(3) + 1;
            } else {
                this.f = 0;
            }
        }
        ea1Var.o(3);
        boolean f4 = ea1Var.f();
        if (this.g == 2 && f4) {
            this.i = ea1Var.f();
        } else {
            this.i = false;
        }
        if (this.g != 1) {
            this.j = ea1Var.f();
        } else {
            this.j = false;
        }
        if (ea1Var.f()) {
            this.m = (byte) ea1Var.g(8);
            this.n = (byte) ea1Var.g(8);
            this.o = (byte) ea1Var.g(8);
        } else {
            this.m = (byte) 0;
            this.n = (byte) 0;
            this.o = (byte) 0;
        }
        if (this.j) {
            ea1Var.n();
            this.k = false;
            this.l = false;
        } else if (this.m == 1 && this.n == 13 && this.o == 0) {
            this.k = false;
            this.l = false;
        } else {
            ea1Var.n();
            int i4 = this.g;
            if (i4 == 0) {
                this.k = true;
                this.l = true;
            } else if (i4 == 1) {
                this.k = false;
                this.l = false;
            } else if (this.i) {
                boolean f5 = ea1Var.f();
                this.k = f5;
                if (f5) {
                    this.l = ea1Var.f();
                } else {
                    this.l = false;
                }
            } else {
                this.k = true;
                this.l = false;
            }
            if (this.k && this.l) {
                ea1Var.g(2);
            }
        }
        ea1Var.n();
    }
}
