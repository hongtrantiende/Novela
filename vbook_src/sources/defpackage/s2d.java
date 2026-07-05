package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s2d  reason: default package */
/* loaded from: classes3.dex */
public final class s2d implements s76 {
    public static final s2d a = new Object();
    public static final y59 b = new y59("kotlin.uuid.Uuid", w59.n);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        q2d q2dVar = (q2d) obj;
        q2dVar.getClass();
        jbeVar.I(q2dVar.toString());
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        String concat;
        String s = yq2Var.s();
        s.getClass();
        int length = s.length();
        int i = 0;
        if (length != 32) {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (s.length() <= 64) {
                    concat = s;
                } else {
                    concat = s.substring(0, 64).concat("...");
                }
                sb.append(concat);
                sb.append("\" of length ");
                sb.append(s.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j = 0;
            while (i < 8) {
                long j2 = j << 4;
                char charAt = s.charAt(i);
                if ((charAt >>> '\b') == 0) {
                    long j3 = w55.c[charAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                lre.n(s, "a hexadecimal digit", i);
                throw null;
            }
            if (s.charAt(8) == '-') {
                long j4 = 0;
                for (int i2 = 9; i2 < 13; i2++) {
                    long j5 = j4 << 4;
                    char charAt2 = s.charAt(i2);
                    if ((charAt2 >>> '\b') == 0) {
                        long j6 = w55.c[charAt2];
                        if (j6 >= 0) {
                            j4 = j5 | j6;
                        }
                    }
                    lre.n(s, "a hexadecimal digit", i2);
                    throw null;
                }
                if (s.charAt(13) == '-') {
                    long j7 = 0;
                    for (int i3 = 14; i3 < 18; i3++) {
                        long j8 = j7 << 4;
                        char charAt3 = s.charAt(i3);
                        if ((charAt3 >>> '\b') == 0) {
                            long j9 = w55.c[charAt3];
                            if (j9 >= 0) {
                                j7 = j8 | j9;
                            }
                        }
                        lre.n(s, "a hexadecimal digit", i3);
                        throw null;
                    }
                    if (s.charAt(18) == '-') {
                        long j10 = 0;
                        for (int i4 = 19; i4 < 23; i4++) {
                            long j11 = j10 << 4;
                            char charAt4 = s.charAt(i4);
                            if ((charAt4 >>> '\b') == 0) {
                                long j12 = w55.c[charAt4];
                                if (j12 >= 0) {
                                    j10 = j11 | j12;
                                }
                            }
                            lre.n(s, "a hexadecimal digit", i4);
                            throw null;
                        }
                        if (s.charAt(23) == '-') {
                            long j13 = 0;
                            for (int i5 = 24; i5 < 36; i5++) {
                                long j14 = j13 << 4;
                                char charAt5 = s.charAt(i5);
                                if ((charAt5 >>> '\b') == 0) {
                                    long j15 = w55.c[charAt5];
                                    if (j15 >= 0) {
                                        j13 = j14 | j15;
                                    }
                                }
                                lre.n(s, "a hexadecimal digit", i5);
                                throw null;
                            }
                            long j16 = (j << 32) | (j4 << 16) | j7;
                            long j17 = (j10 << 48) | j13;
                            if (j16 != 0 || j17 != 0) {
                                return new q2d(j16, j17);
                            }
                        } else {
                            lre.n(s, "'-' (hyphen)", 23);
                            throw null;
                        }
                    } else {
                        lre.n(s, "'-' (hyphen)", 18);
                        throw null;
                    }
                } else {
                    lre.n(s, "'-' (hyphen)", 13);
                    throw null;
                }
            } else {
                lre.n(s, "'-' (hyphen)", 8);
                throw null;
            }
        } else {
            long j18 = 0;
            while (i < 16) {
                long j19 = j18 << 4;
                char charAt6 = s.charAt(i);
                if ((charAt6 >>> '\b') == 0) {
                    long j20 = w55.c[charAt6];
                    if (j20 >= 0) {
                        j18 = j19 | j20;
                        i++;
                    }
                }
                lre.n(s, "a hexadecimal digit", i);
                throw null;
            }
            long j21 = 0;
            for (int i6 = 16; i6 < 32; i6++) {
                long j22 = j21 << 4;
                char charAt7 = s.charAt(i6);
                if ((charAt7 >>> '\b') == 0) {
                    long j23 = w55.c[charAt7];
                    if (j23 >= 0) {
                        j21 = j22 | j23;
                    }
                }
                lre.n(s, "a hexadecimal digit", i6);
                throw null;
            }
            if (j18 != 0 || j21 != 0) {
                return new q2d(j18, j21);
            }
        }
        return q2d.c;
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
