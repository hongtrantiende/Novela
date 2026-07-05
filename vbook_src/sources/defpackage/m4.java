package defpackage;

import java.text.BreakIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m4  reason: default package */
/* loaded from: classes.dex */
public final class m4 extends l4 {
    public static m4 f;
    public static m4 g;
    public static m4 h;
    public static final oq9 i = oq9.b;
    public static final oq9 j = oq9.a;
    public final /* synthetic */ int d;
    public Object e;

    @Override // defpackage.l4
    public final int[] a(int i2) {
        int i3;
        switch (this.d) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.e;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i2);
                        BreakIterator breakIterator2 = (BreakIterator) this.e;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i2 = breakIterator2.following(i2);
                            } else {
                                c16.w("impl");
                                throw null;
                            }
                        } else if (breakIterator2 != null) {
                            int following = breakIterator2.following(i2);
                            if (following == -1) {
                                return null;
                            }
                            return b(i2, following);
                        } else {
                            c16.w("impl");
                            throw null;
                        }
                    } else {
                        c16.w("impl");
                        throw null;
                    }
                } while (i2 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!m(i2) && (!m(i2) || (i2 != 0 && m(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.e;
                    if (breakIterator3 != null) {
                        i2 = breakIterator3.following(i2);
                        if (i2 == -1) {
                            return null;
                        }
                    } else {
                        c16.w("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.e;
                if (breakIterator4 != null) {
                    int following2 = breakIterator4.following(i2);
                    if (following2 == -1 || !l(following2)) {
                        return null;
                    }
                    return b(i2, following2);
                }
                c16.w("impl");
                throw null;
            default:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                fvb fvbVar = (fvb) this.e;
                oq9 oq9Var = i;
                if (i2 < 0) {
                    if (fvbVar != null) {
                        i3 = fvbVar.b.d(0);
                    } else {
                        c16.w("layoutResult");
                        throw null;
                    }
                } else if (fvbVar != null) {
                    int d = fvbVar.b.d(i2);
                    if (j(d, oq9Var) == i2) {
                        i3 = d;
                    } else {
                        i3 = d + 1;
                    }
                } else {
                    c16.w("layoutResult");
                    throw null;
                }
                fvb fvbVar2 = (fvb) this.e;
                if (fvbVar2 != null) {
                    if (i3 >= fvbVar2.b.f) {
                        return null;
                    }
                    return b(j(i3, oq9Var), j(i3, j) + 1);
                }
                c16.w("layoutResult");
                throw null;
        }
    }

    @Override // defpackage.l4
    public final int[] d(int i2) {
        int i3;
        switch (this.d) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.e;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i2);
                        BreakIterator breakIterator2 = (BreakIterator) this.e;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i2 = breakIterator2.preceding(i2);
                            } else {
                                c16.w("impl");
                                throw null;
                            }
                        } else if (breakIterator2 != null) {
                            int preceding = breakIterator2.preceding(i2);
                            if (preceding == -1) {
                                return null;
                            }
                            return b(preceding, i2);
                        } else {
                            c16.w("impl");
                            throw null;
                        }
                    } else {
                        c16.w("impl");
                        throw null;
                    }
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !m(i2 - 1) && !l(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.e;
                    if (breakIterator3 != null) {
                        i2 = breakIterator3.preceding(i2);
                        if (i2 == -1) {
                            return null;
                        }
                    } else {
                        c16.w("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.e;
                if (breakIterator4 != null) {
                    int preceding2 = breakIterator4.preceding(i2);
                    if (preceding2 == -1 || !m(preceding2)) {
                        return null;
                    }
                    if (preceding2 != 0 && m(preceding2 - 1)) {
                        return null;
                    }
                    return b(preceding2, i2);
                }
                c16.w("impl");
                throw null;
            default:
                if (c().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = c().length();
                fvb fvbVar = (fvb) this.e;
                oq9 oq9Var = j;
                if (i2 > length3) {
                    if (fvbVar != null) {
                        i3 = fvbVar.b.d(c().length());
                    } else {
                        c16.w("layoutResult");
                        throw null;
                    }
                } else if (fvbVar != null) {
                    int d = fvbVar.b.d(i2);
                    if (j(d, oq9Var) + 1 == i2) {
                        i3 = d;
                    } else {
                        i3 = d - 1;
                    }
                } else {
                    c16.w("layoutResult");
                    throw null;
                }
                if (i3 < 0) {
                    return null;
                }
                return b(j(i3, i), j(i3, oq9Var) + 1);
        }
    }

    public int j(int i2, oq9 oq9Var) {
        fvb fvbVar = (fvb) this.e;
        if (fvbVar != null) {
            int i3 = fvbVar.i(i2);
            fvb fvbVar2 = (fvb) this.e;
            if (fvbVar2 != null) {
                oq9 h2 = fvbVar2.b.h(i3);
                fvb fvbVar3 = (fvb) this.e;
                if (oq9Var != h2) {
                    if (fvbVar3 != null) {
                        return fvbVar3.i(i2);
                    }
                    c16.w("layoutResult");
                    throw null;
                } else if (fvbVar3 != null) {
                    return fvbVar3.b.c(i2, false) - 1;
                } else {
                    c16.w("layoutResult");
                    throw null;
                }
            }
            c16.w("layoutResult");
            throw null;
        }
        c16.w("layoutResult");
        throw null;
    }

    public void k(String str) {
        switch (this.d) {
            case 0:
                this.b = str;
                BreakIterator breakIterator = (BreakIterator) this.e;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    c16.w("impl");
                    throw null;
                }
            default:
                this.b = str;
                BreakIterator breakIterator2 = (BreakIterator) this.e;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    c16.w("impl");
                    throw null;
                }
        }
    }

    public boolean l(int i2) {
        if (i2 > 0 && m(i2 - 1)) {
            if (i2 == c().length() || !m(i2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean m(int i2) {
        if (i2 >= 0 && i2 < c().length()) {
            return Character.isLetterOrDigit(c().codePointAt(i2));
        }
        return false;
    }
}
