package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ihf  reason: default package */
/* loaded from: classes.dex */
public final class ihf implements Iterator {
    public final /* synthetic */ Object C;
    public String b;
    public final CharSequence c;
    public final /* synthetic */ int f;
    public int a = 2;
    public int d = 0;
    public int e = Integer.MAX_VALUE;

    public ihf(l97 l97Var, CharSequence charSequence, Object obj, int i) {
        this.f = i;
        this.C = obj;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int end;
        boolean z;
        int i = this.a;
        if (i != 4) {
            int i2 = i - 1;
            if (i2 == 0) {
                return true;
            }
            if (i2 != 2) {
                this.a = 4;
                int i3 = this.d;
                while (true) {
                    int i4 = this.d;
                    if (i4 != -1) {
                        int i5 = this.f;
                        CharSequence charSequence = this.c;
                        Object obj = this.C;
                        switch (i5) {
                            case 0:
                                Matcher matcher = (Matcher) ((l2f) obj).a;
                                if (matcher.find(i4)) {
                                    i4 = matcher.start();
                                    break;
                                }
                                i4 = -1;
                                break;
                            default:
                                gqe gqeVar = (gqe) obj;
                                int length = charSequence.length();
                                if (i4 >= 0 && i4 <= length) {
                                    while (i4 < length) {
                                        if (charSequence.charAt(i4) == gqeVar.a) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    i4 = -1;
                                    break;
                                } else {
                                    cy7.k(zpe.v(i4, length, "index"));
                                    i4 = 0;
                                    break;
                                }
                        }
                        if (i4 == -1) {
                            i4 = charSequence.length();
                            this.d = -1;
                        } else {
                            switch (i5) {
                                case 0:
                                    end = ((Matcher) ((l2f) obj).a).end();
                                    break;
                                default:
                                    end = i4 + 1;
                                    break;
                            }
                            this.d = end;
                        }
                        int i6 = this.d;
                        if (i6 == i3) {
                            int i7 = i6 + 1;
                            this.d = i7;
                            if (i7 > charSequence.length()) {
                                this.d = -1;
                            }
                        } else {
                            if (i3 < i4) {
                                charSequence.charAt(i3);
                            }
                            if (i4 > i3) {
                                charSequence.charAt(i4 - 1);
                            }
                            int i8 = this.e;
                            if (i8 == 1) {
                                i4 = charSequence.length();
                                this.d = -1;
                                if (i4 > i3) {
                                    charSequence.charAt(i4 - 1);
                                }
                            } else {
                                this.e = i8 - 1;
                            }
                            str = charSequence.subSequence(i3, i4).toString();
                        }
                    } else {
                        this.a = 3;
                        str = null;
                    }
                }
                this.b = str;
                if (this.a != 3) {
                    this.a = 1;
                    return true;
                }
            }
            return false;
        }
        vm1.d();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.a = 2;
            String str = this.b;
            this.b = null;
            return str;
        }
        xk5.g();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
