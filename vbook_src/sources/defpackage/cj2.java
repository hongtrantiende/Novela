package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cj2  reason: default package */
/* loaded from: classes3.dex */
public final class cj2 {
    public static dj2 a(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt;
        char c;
        str.getClass();
        int i7 = 0;
        char c2 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z = false;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        while (i7 < str.length()) {
            if (c2 == 0) {
                int i17 = i7 + 1;
                if (i17 >= str.length()) {
                    i = i8;
                    if (str.charAt(i7) == '+' || str.charAt(i7) == '-') {
                        throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Unexpected end of string; 'P' designator is required", i7));
                    }
                } else {
                    i = i8;
                }
                char charAt2 = str.charAt(i7);
                if (charAt2 != '+' && charAt2 != '-') {
                    if (charAt2 == 'P') {
                        i7 = i17;
                    } else {
                        throw new IllegalArgumentException(hl5.m("Parse error at char ", ": ", i7, "Expected '+', '-', 'P', got '" + str.charAt(i7) + '\''));
                    }
                } else {
                    if (str.charAt(i7) == '-') {
                        i16 = -1;
                    }
                    if (str.charAt(i17) == 'P') {
                        i7 += 2;
                    } else {
                        throw new IllegalArgumentException(hl5.m("Parse error at char ", ": ", i17, "Expected 'P', got '" + str.charAt(i17) + '\''));
                    }
                }
                c2 = 1;
                i8 = i;
            } else {
                int i18 = i8;
                char charAt3 = str.charAt(i7);
                if (charAt3 != '+' && charAt3 != '-') {
                    if (('0' > charAt3 || charAt3 >= ':') && charAt3 == 'T') {
                        if (c2 < 6) {
                            i7++;
                            i8 = i18;
                            c2 = 6;
                        } else {
                            throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Only one 'T' designator is allowed", i7));
                        }
                    } else {
                        i3 = i7;
                        i4 = i16;
                    }
                } else {
                    if (str.charAt(i7) == '-') {
                        i2 = i16 * (-1);
                    } else {
                        i2 = i16;
                    }
                    int i19 = i7 + 1;
                    if (i19 < str.length()) {
                        char charAt4 = str.charAt(i19);
                        int i20 = i2;
                        if ('0' <= charAt4 && charAt4 < ':') {
                            i3 = i19;
                            i4 = i20;
                        }
                    }
                    throw new IllegalArgumentException(hl5.m("Parse error at char ", ": ", i19, "A number expected after '" + str.charAt(i19) + '\''));
                }
                long j = 0;
                while (true) {
                    if (i3 < str.length()) {
                        char charAt5 = str.charAt(i3);
                        i5 = i9;
                        if ('0' > charAt5 || charAt5 >= ':') {
                            break;
                        }
                        int i21 = i10;
                        int i22 = i11;
                        try {
                            j = Math.addExact(Math.multiplyExact(j, 10L), str.charAt(i3) - '0');
                            i3++;
                            i9 = i5;
                            i10 = i21;
                            i11 = i22;
                        } catch (ArithmeticException unused) {
                            throw new IllegalArgumentException(hl5.l("Parse error at char ", ": The number is too large", i7));
                        }
                    } else {
                        i5 = i9;
                        break;
                    }
                }
                int i23 = i10;
                int i24 = i11;
                long j2 = i4 * j;
                if (i3 != str.length()) {
                    char upperCase = Character.toUpperCase(str.charAt(i3));
                    int i25 = i4;
                    int i26 = i12;
                    int i27 = i13;
                    int i28 = i14;
                    if (upperCase != ',' && upperCase != '.') {
                        if (upperCase != 'D') {
                            if (upperCase != 'H') {
                                if (upperCase != 'M') {
                                    if (upperCase != 'S') {
                                        if (upperCase != 'W') {
                                            if (upperCase == 'Y') {
                                                if (c2 < 2) {
                                                    if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                                        i10 = (int) j2;
                                                        c2 = 2;
                                                        i9 = i5;
                                                    } else {
                                                        throw new IllegalArgumentException(hl5.m("Parse error at char ", ": ", i7, nk2.t(j2, "Value ", " does not fit into an Int, which is required for component 'Y'")));
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i3));
                                                }
                                            } else {
                                                throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Expected a designator after the numerical value", i3));
                                            }
                                        } else if (c2 < 4) {
                                            if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                                i9 = (int) j2;
                                                c2 = 4;
                                                i10 = i23;
                                            } else {
                                                throw new IllegalArgumentException(hl5.m("Parse error at char ", ": ", i7, nk2.t(j2, "Value ", " does not fit into an Int, which is required for component 'W'")));
                                            }
                                        } else {
                                            throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i3));
                                        }
                                        i11 = i24;
                                        i8 = i18;
                                    } else if (c2 < '\t' && c2 >= 6) {
                                        if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                            i14 = (int) j2;
                                            i9 = i5;
                                            i10 = i23;
                                            i11 = i24;
                                            i8 = i18;
                                            i12 = i26;
                                            i13 = i27;
                                            c2 = '\t';
                                        } else {
                                            throw new IllegalArgumentException(hl5.m("Parse error at char ", ": ", i7, nk2.t(j2, "Value ", " does not fit into an Int, which is required for component 'S'")));
                                        }
                                    } else {
                                        throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i3));
                                    }
                                } else {
                                    if (c2 >= 6) {
                                        c = '\b';
                                        if (c2 < '\b') {
                                            if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                                i13 = (int) j2;
                                                i11 = i24;
                                            } else {
                                                throw new IllegalArgumentException(hl5.m("Parse error at char ", ": ", i7, nk2.t(j2, "Value ", " does not fit into an Int, which is required for component 'M'")));
                                            }
                                        } else {
                                            throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i3));
                                        }
                                    } else {
                                        c = 3;
                                        if (c2 < 3) {
                                            if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                                i11 = (int) j2;
                                                i13 = i27;
                                            } else {
                                                throw new IllegalArgumentException(hl5.m("Parse error at char ", ": ", i7, nk2.t(j2, "Value ", " does not fit into an Int, which is required for component 'M'")));
                                            }
                                        } else {
                                            throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i3));
                                        }
                                    }
                                    c2 = c;
                                    i9 = i5;
                                    i10 = i23;
                                    i8 = i18;
                                    i12 = i26;
                                    i14 = i28;
                                }
                            } else if (c2 < 7 && c2 >= 6) {
                                if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                    i12 = (int) j2;
                                    c2 = 7;
                                    i9 = i5;
                                    i10 = i23;
                                    i11 = i24;
                                    i8 = i18;
                                    i13 = i27;
                                    i14 = i28;
                                } else {
                                    throw new IllegalArgumentException(hl5.m("Parse error at char ", ": ", i7, nk2.t(j2, "Value ", " does not fit into an Int, which is required for component 'H'")));
                                }
                            } else {
                                throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i3));
                            }
                        } else if (c2 < 5) {
                            if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                i8 = (int) j2;
                                c2 = 5;
                                i9 = i5;
                                i10 = i23;
                                i11 = i24;
                            } else {
                                throw new IllegalArgumentException(hl5.m("Parse error at char ", ": ", i7, nk2.t(j2, "Value ", " does not fit into an Int, which is required for component 'D'")));
                            }
                        } else {
                            throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i3));
                        }
                        i12 = i26;
                        i13 = i27;
                        i14 = i28;
                    } else {
                        int i29 = i3 + 1;
                        if (i29 < str.length()) {
                            i3 = i29;
                            while (i3 < str.length() && '0' <= (charAt = str.charAt(i3)) && charAt < ':') {
                                i3++;
                            }
                            if (i3 - i29 <= 9) {
                                nqe.u(10);
                                int parseInt = Integer.parseInt(str.substring(i29, i3) + r4b.M(9 - i6, "0"), 10) * i25;
                                if (str.charAt(i3) == 'S') {
                                    if (c2 < '\t' && c2 >= 6) {
                                        if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                            int i30 = (int) j2;
                                            i15 = parseInt;
                                            c2 = '\t';
                                            i9 = i5;
                                            i10 = i23;
                                            i11 = i24;
                                            i8 = i18;
                                            i12 = i26;
                                            i13 = i27;
                                            i14 = i30;
                                        } else {
                                            throw new IllegalArgumentException(hl5.m("Parse error at char ", ": ", i7, nk2.t(j2, "Value ", " does not fit into an Int, which is required for component 'S'")));
                                        }
                                    } else {
                                        throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i3));
                                    }
                                } else {
                                    throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Expected the 'S' designator after a fraction", i3));
                                }
                            } else {
                                throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Only the nanosecond fractions of a second are supported", i29));
                            }
                        } else {
                            throw new IllegalArgumentException(hl5.m("Parse error at char ", ": ", i29, "Expected designator 'S' after " + str.charAt(i3)));
                        }
                    }
                    i7 = i3 + 1;
                    z = true;
                } else {
                    throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Expected a designator after the numerical value", i3));
                }
            }
        }
        if (c2 != 0) {
            if (c2 != 6) {
                long j3 = i8 + (i9 * 7);
                if (-2147483648L <= j3 && j3 <= 2147483647L) {
                    int i31 = (int) j3;
                    if (z) {
                        long j4 = i15;
                        long k0 = hbe.k0(i10, i11);
                        long j5 = (j4 / 1000000000) + (((i12 * 60) + i13) * 60) + i14;
                        try {
                            long j6 = j4 % 1000000000;
                            int i32 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
                            if (i32 > 0 && j6 < 0) {
                                j5--;
                                j6 += 1000000000;
                            } else if (i32 < 0 && j6 > 0) {
                                j5++;
                                j6 -= 1000000000;
                            }
                            long addExact = Math.addExact(Math.multiplyExact(j5, 1000000000L), j6);
                            if (addExact != 0) {
                                return new ej2(k0, addExact, i31);
                            }
                            return new ri2(k0, i31);
                        } catch (ArithmeticException unused2) {
                            StringBuilder r = hl5.r(i12, i13, "The total number of nanoseconds in ", " hours, ", " minutes, ");
                            r.append(i14);
                            r.append(" seconds, and ");
                            r.append(j4);
                            r.append(" nanoseconds overflows a Long");
                            throw new IllegalArgumentException(r.toString());
                        }
                    }
                    throw new IllegalArgumentException("Parse error at char 0: At least one component is required, but none were found");
                }
                throw new IllegalArgumentException("Parse error at char 0: The total number of days under 'D' and 'W' designators should fit into an Int");
            }
            throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Unexpected end of input; at least one time component is required after 'T'", i7));
        }
        throw new IllegalArgumentException(hl5.l("Parse error at char ", ": Unexpected end of input; 'P' designator is required", i7));
    }

    public final s76 serializer() {
        return gj2.b;
    }
}
