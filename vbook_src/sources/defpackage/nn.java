package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nn  reason: default package */
/* loaded from: classes3.dex */
public final class nn {
    public final do4 a;
    public final r13 b;
    public final tc6 c;

    public nn(do4 do4Var, r13 r13Var, tc6 tc6Var) {
        this.a = do4Var;
        this.b = r13Var;
        this.c = tc6Var;
    }

    public static ArrayList a(ArrayList arrayList, float f, int i, int i2, int i3, int i4, boolean z) {
        float f2;
        float f3;
        float f4;
        int i5;
        float f5;
        float f6;
        float f7;
        float f8;
        ArrayList arrayList2 = new ArrayList();
        if (i4 == 6 || i4 == 2) {
            if (i <= i2) {
                int i6 = i;
                f2 = 0.0f;
                while (true) {
                    f2 += ((dnb) arrayList.get(i6)).d;
                    if (i6 == i2) {
                        break;
                    }
                    i6++;
                }
            } else {
                f2 = 0.0f;
            }
            float f9 = i3 - f2;
            if (i <= i2) {
                while (true) {
                    arrayList2.add(dnb.a((dnb) arrayList.get(i), null, f9, nae.e, 27));
                    f9 += ((dnb) arrayList.get(i)).d;
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
        } else if (i4 == 3) {
            if (i <= i2) {
                int i7 = i;
                f8 = 0.0f;
                while (true) {
                    f8 += ((dnb) arrayList.get(i7)).d;
                    if (i7 == i2) {
                        break;
                    }
                    i7++;
                }
            } else {
                f8 = 0.0f;
            }
            float f10 = (i3 - f8) / 2.0f;
            if (i <= i2) {
                while (true) {
                    arrayList2.add(dnb.a((dnb) arrayList.get(i), null, f10, nae.e, 27));
                    f10 += ((dnb) arrayList.get(i)).d;
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
        } else if (i4 == 4) {
            if (z) {
                if (i <= i2) {
                    int i8 = i;
                    i5 = 0;
                    f5 = 0.0f;
                    while (true) {
                        if (nqe.y(((dnb) arrayList.get(i8)).a.charAt(0))) {
                            i5++;
                        } else {
                            f5 += ((dnb) arrayList.get(i8)).d;
                        }
                        if (i8 == i2) {
                            break;
                        }
                        i8++;
                    }
                } else {
                    i5 = 0;
                    f5 = 0.0f;
                }
                int i9 = i;
                if (i <= i2) {
                    while (nqe.y(((dnb) arrayList.get(i9)).a.charAt(0))) {
                        i5--;
                        if (i9 == i2) {
                            break;
                        }
                        i9++;
                    }
                }
                int i10 = i2;
                if (i <= i2) {
                    while (nqe.y(((dnb) arrayList.get(i10)).a.charAt(0))) {
                        i5--;
                        if (i10 == i) {
                            break;
                        }
                        i10--;
                    }
                }
                if (i5 > 0) {
                    f6 = ((i3 - f) - f5) / i5;
                } else {
                    f6 = 0.0f;
                }
                if (i <= i2) {
                    while (true) {
                        if (nqe.y(((dnb) arrayList.get(i)).a.charAt(0))) {
                            if (i >= i9 && i <= i10) {
                                f7 = f6;
                            } else {
                                f7 = 0.0f;
                            }
                        } else {
                            f7 = ((dnb) arrayList.get(i)).d;
                        }
                        arrayList2.add(dnb.a((dnb) arrayList.get(i), null, f, f7, 19));
                        f += f7;
                        if (i == i2) {
                            break;
                        }
                        i++;
                    }
                }
            } else {
                if (i <= i2) {
                    int i11 = i;
                    f3 = 0.0f;
                    while (true) {
                        f3 += ((dnb) arrayList.get(i11)).d;
                        if (i11 == i2) {
                            break;
                        }
                        i11++;
                    }
                } else {
                    f3 = 0.0f;
                }
                float f11 = ((i3 - f) - f3) / (i2 - i);
                if (i <= i2) {
                    while (true) {
                        float f12 = ((dnb) arrayList.get(i)).d;
                        if (i == i2) {
                            f4 = 0.0f;
                        } else {
                            f4 = f11;
                        }
                        float f13 = f12 + f4;
                        arrayList2.add(dnb.a((dnb) arrayList.get(i), null, f, f13, 19));
                        f += f13;
                        if (i == i2) {
                            break;
                        }
                        i++;
                    }
                }
            }
        } else if (i <= i2) {
            while (true) {
                arrayList2.add(dnb.a((dnb) arrayList.get(i), null, f, nae.e, 27));
                f += ((dnb) arrayList.get(i)).d;
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        return arrayList2;
    }
}
