package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m41  reason: default package */
/* loaded from: classes3.dex */
public final class m41 implements m82 {
    public final /* synthetic */ int a = 1;
    public final d82 b;

    /* JADX WARN: Type inference failed for: r5v1, types: [xl9, java.lang.Object] */
    public m41(d82 d82Var, s11 s11Var, String str, Long l) {
        char c;
        boolean z;
        d82Var.getClass();
        s11Var.getClass();
        this.b = d82Var;
        d31 d31Var = mu7.a;
        e32 e32Var = c32.a;
        boolean z2 = true;
        if (k4b.A0(str, "multipart/", true)) {
            int length = str.length();
            int i = 0;
            boolean z3 = false;
            int i2 = 0;
            while (true) {
                if (i < length) {
                    char charAt = str.charAt(i);
                    if (z3) {
                        if (!z3) {
                            if (!z3) {
                                if (!z3) {
                                    if (!z3) {
                                    }
                                    z3 = true;
                                } else {
                                    if (charAt != '\"') {
                                        if (charAt == '\\') {
                                            z3 = true;
                                        }
                                    }
                                    z3 = true;
                                }
                            } else {
                                if (charAt != '\"') {
                                    if (charAt != ',') {
                                        if (charAt != ';') {
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                }
                                z3 = true;
                            }
                        } else if (charAt == '=') {
                            z3 = true;
                        } else if (charAt != ';') {
                            if (charAt != ',') {
                                if (charAt == ' ') {
                                    continue;
                                } else {
                                    if (i2 == 0) {
                                        z = true;
                                        c = '\"';
                                        if (k4b.s0(str, i, "boundary=", 0, 9, true)) {
                                            break;
                                        }
                                    }
                                    i2++;
                                }
                            }
                            z3 = false;
                        }
                    } else {
                        i = charAt != ';' ? i + 1 : i;
                        z3 = true;
                    }
                    i2 = 0;
                } else {
                    c = '\"';
                    z = true;
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                int i3 = i + 9;
                byte[] bArr = new byte[74];
                ?? obj = new Object();
                mu7.c(obj, bArr, (byte) 13);
                mu7.c(obj, bArr, (byte) 10);
                mu7.c(obj, bArr, (byte) 45);
                mu7.c(obj, bArr, (byte) 45);
                int length2 = str.length();
                boolean z4 = false;
                while (i3 < length2) {
                    char charAt2 = str.charAt(i3);
                    int i4 = 65535 & charAt2;
                    if (i4 <= 127) {
                        if (z4) {
                            if (z4 != z2) {
                                if (z4 != z) {
                                    if (z4) {
                                        mu7.c(obj, bArr, (byte) i4);
                                        z4 = z;
                                    }
                                } else if (charAt2 == c) {
                                    break;
                                } else if (charAt2 != '\\') {
                                    mu7.c(obj, bArr, (byte) i4);
                                } else {
                                    z4 = true;
                                }
                                i3++;
                                z2 = true;
                            } else if (charAt2 == ' ' || charAt2 == ',' || charAt2 == ';') {
                                break;
                            } else {
                                mu7.c(obj, bArr, (byte) i4);
                                i3++;
                                z2 = true;
                            }
                        } else {
                            if (charAt2 == ' ') {
                                continue;
                            } else if (charAt2 != c) {
                                if (charAt2 == ',' || charAt2 == ';') {
                                    break;
                                }
                                mu7.c(obj, bArr, (byte) i4);
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            i3++;
                            z2 = true;
                        }
                    } else {
                        nqe.u(16);
                        String num = Integer.toString(i4, 16);
                        num.getClass();
                        throw new IOException("Failed to parse multipart: wrong boundary byte 0x" + num + " - should be 7bit character");
                    }
                }
                int i5 = obj.a;
                if (i5 != 4) {
                    byte[] d0 = b00.d0(bArr, 0, i5);
                    pae.k(this, 0, new iu7(s11Var, new d31(d0, 0, d0.length), l, null), 3);
                    return;
                }
                fb4.k("Empty multipart boundary is not allowed");
                throw null;
            }
            fb4.k("Failed to parse multipart: Content-Type's boundary parameter is missing");
            throw null;
        }
        throw new IOException("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((Object) str));
    }

    @Override // defpackage.m82
    public final d82 q() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "CoroutineScope(coroutineContext=" + this.b + ')';
            default:
                return super.toString();
        }
    }

    public m41(d82 d82Var) {
        this.b = d82Var;
    }
}
