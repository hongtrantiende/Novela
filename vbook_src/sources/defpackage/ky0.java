package defpackage;

import java.io.Closeable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ky0  reason: default package */
/* loaded from: classes3.dex */
public final class ky0 implements Closeable {
    public my0 a;
    public boolean b;
    public e5a c;
    public byte[] e;
    public long d = -1;
    public int f = -1;
    public int C = -1;

    public final void C(long j) {
        my0 my0Var = this.a;
        if (my0Var != null) {
            if (this.b) {
                long j2 = my0Var.b;
                int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                if (i <= 0) {
                    if (j >= 0) {
                        long j3 = j2 - j;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            e5a e5aVar = my0Var.a;
                            e5aVar.getClass();
                            e5a e5aVar2 = e5aVar.g;
                            e5aVar2.getClass();
                            int i2 = e5aVar2.c;
                            long j4 = i2 - e5aVar2.b;
                            if (j4 <= j3) {
                                my0Var.a = e5aVar2.a();
                                n5a.a(e5aVar2);
                                j3 -= j4;
                            } else {
                                e5aVar2.c = i2 - ((int) j3);
                                break;
                            }
                        }
                        this.c = null;
                        this.d = j;
                        this.e = null;
                        this.f = -1;
                        this.C = -1;
                    } else {
                        p1a.k(hl5.k(j, "newSize < 0: "));
                        return;
                    }
                } else if (i > 0) {
                    long j5 = j - j2;
                    int i3 = 1;
                    boolean z = true;
                    for (long j6 = 0; j5 > j6; j6 = 0) {
                        e5a b1 = my0Var.b1(i3);
                        int min = (int) Math.min(j5, 8192 - b1.c);
                        int i4 = b1.c + min;
                        b1.c = i4;
                        j5 -= min;
                        if (z) {
                            this.c = b1;
                            this.d = j2;
                            this.e = b1.a;
                            this.f = i4 - min;
                            this.C = i4;
                            z = false;
                        }
                        i3 = 1;
                    }
                }
                my0Var.b = j;
                return;
            }
            vs.k("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        vs.k("not attached to a buffer");
    }

    public final int G(long j) {
        int i;
        long j2;
        my0 my0Var = this.a;
        if (my0Var != null) {
            int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if (i2 >= 0 && j <= (my0Var.b)) {
                if (i2 != 0 && i != 0) {
                    e5a e5aVar = my0Var.a;
                    e5a e5aVar2 = this.c;
                    long j3 = 0;
                    if (e5aVar2 != null) {
                        long j4 = this.d - (this.f - e5aVar2.b);
                        if (j4 > j) {
                            e5aVar2 = e5aVar;
                            e5aVar = e5aVar2;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        e5aVar2 = e5aVar;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            e5aVar2.getClass();
                            long j5 = (e5aVar2.c - e5aVar2.b) + j3;
                            if (j < j5) {
                                break;
                            }
                            e5aVar2 = e5aVar2.f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            e5aVar.getClass();
                            e5aVar = e5aVar.g;
                            e5aVar.getClass();
                            j2 -= e5aVar.c - e5aVar.b;
                        }
                        e5aVar2 = e5aVar;
                        j3 = j2;
                    }
                    if (this.b) {
                        e5aVar2.getClass();
                        if (e5aVar2.d) {
                            byte[] bArr = e5aVar2.a;
                            e5a e5aVar3 = new e5a(Arrays.copyOf(bArr, bArr.length), e5aVar2.b, e5aVar2.c, false, true);
                            if (my0Var.a == e5aVar2) {
                                my0Var.a = e5aVar3;
                            }
                            e5aVar2.b(e5aVar3);
                            e5a e5aVar4 = e5aVar3.g;
                            e5aVar4.getClass();
                            e5aVar4.a();
                            e5aVar2 = e5aVar3;
                        }
                    }
                    this.c = e5aVar2;
                    this.d = j;
                    e5aVar2.getClass();
                    this.e = e5aVar2.a;
                    int i3 = e5aVar2.b + ((int) (j - j3));
                    this.f = i3;
                    int i4 = e5aVar2.c;
                    this.C = i4;
                    return i4 - i3;
                }
                this.c = null;
                this.d = j;
                this.e = null;
                this.f = -1;
                this.C = -1;
                return -1;
            }
            StringBuilder o = rs8.o(j, "offset=", " > size=");
            o.append(my0Var.b);
            throw new ArrayIndexOutOfBoundsException(o.toString());
        }
        vs.k("not attached to a buffer");
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a != null) {
            this.a = null;
            this.c = null;
            this.d = -1L;
            this.e = null;
            this.f = -1;
            this.C = -1;
            return;
        }
        vs.k("not attached to a buffer");
    }

    public final void o() {
        my0 my0Var = this.a;
        if (my0Var != null) {
            if (this.b) {
                long j = my0Var.b;
                e5a b1 = my0Var.b1(1);
                int i = 8192 - b1.c;
                b1.c = 8192;
                my0Var.b = i + j;
                this.c = b1;
                this.d = j;
                this.e = b1.a;
                this.f = 8192 - i;
                this.C = 8192;
                return;
            }
            vs.k("expandBuffer() only permitted for read/write buffers");
            return;
        }
        vs.k("not attached to a buffer");
    }

    public final int q() {
        long j = this.d;
        my0 my0Var = this.a;
        my0Var.getClass();
        if (j != my0Var.b) {
            long j2 = this.d;
            if (j2 == -1) {
                return G(0L);
            }
            return G(j2 + (this.C - this.f));
        }
        vs.k("no more bytes");
        return 0;
    }
}
