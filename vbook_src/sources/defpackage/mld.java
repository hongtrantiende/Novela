package defpackage;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mld  reason: default package */
/* loaded from: classes.dex */
public final class mld {
    public final /* synthetic */ int a;
    public final CharSequence b;
    public final int c;
    public final int d;
    public final BreakIterator e;

    public mld(CharSequence charSequence, int i, Locale locale, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = charSequence;
                if (charSequence.length() < 0) {
                    mv5.a("input start index is outside the CharSequence");
                }
                if (i < 0 || i > charSequence.length()) {
                    mv5.a("input end index is outside the CharSequence");
                }
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                this.e = wordInstance;
                this.c = Math.max(0, -50);
                this.d = Math.min(charSequence.length(), i + 50);
                wordInstance.setText(new oc1(charSequence, i));
                return;
            default:
                charSequence.getClass();
                this.b = charSequence;
                if (charSequence.length() >= 0) {
                    if (i >= 0 && i <= charSequence.length()) {
                        BreakIterator wordInstance2 = BreakIterator.getWordInstance(locale);
                        wordInstance2.getClass();
                        this.e = wordInstance2;
                        this.c = Math.max(0, -50);
                        this.d = Math.min(charSequence.length(), i + 50);
                        wordInstance2.setText(new nc1(charSequence, i));
                        return;
                    }
                    vs.m("input end index is outside the CharSequence");
                    throw null;
                }
                vs.m("input start index is outside the CharSequence");
                throw null;
        }
    }

    public final void a(int i) {
        int i2 = this.a;
        int i3 = this.d;
        int i4 = this.c;
        switch (i2) {
            case 0:
                if (i > i3 || i4 > i) {
                    p1a.k(rs8.g(i3, "]", hl5.r(i, i4, "Invalid offset: ", ". Valid range is [", " , ")));
                    return;
                }
                return;
            default:
                boolean z = false;
                if (i <= i3 && i4 <= i) {
                    z = true;
                }
                if (!z) {
                    StringBuilder r = hl5.r(i, i4, "Invalid offset: ", ". Valid range is [", " , ");
                    r.append(i3);
                    r.append("]");
                    mv5.a(r.toString());
                    return;
                }
                return;
        }
    }

    public boolean b(int i) {
        int i2 = this.c + 1;
        if (i <= this.d && i2 <= i && Character.isLetterOrDigit(Character.codePointBefore(this.b, i))) {
            return true;
        }
        return false;
    }

    public boolean c(int i) {
        int i2 = this.c + 1;
        if (i <= this.d && i2 <= i) {
            CharSequence charSequence = this.b;
            if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
                int i3 = i - 1;
                if (!Character.isSurrogate(charSequence.charAt(i3))) {
                    if (cq3.d()) {
                        cq3 a = cq3.a();
                        if (a.c() != 1 || a.b(charSequence, i3) == -1) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.c + 1;
                if (i <= this.d && i2 <= i) {
                    return twe.m(Character.codePointBefore(this.b, i));
                }
                return false;
            default:
                int i3 = this.c + 1;
                if (i <= this.d && i3 <= i) {
                    return uwe.m(Character.codePointBefore(this.b, i));
                }
                return false;
        }
    }

    public boolean e(int i) {
        a(i);
        if (this.e.isBoundary(i)) {
            if (!h(i) || !h(i - 1) || !h(i + 1)) {
                if (i <= 0 || i >= this.b.length() - 1 || (!f(i) && !f(i + 1))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean f(int i) {
        int i2 = i - 1;
        CharSequence charSequence = this.b;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (!c16.i(of, unicodeBlock) || !c16.i(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            if (c16.i(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && c16.i(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean g(int i) {
        if (i < this.d && this.c <= i && Character.isLetterOrDigit(Character.codePointAt(this.b, i))) {
            return true;
        }
        return false;
    }

    public boolean h(int i) {
        if (i < this.d && this.c <= i) {
            CharSequence charSequence = this.b;
            if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
                if (cq3.d()) {
                    cq3 a = cq3.a();
                    if (a.c() != 1 || a.b(charSequence, i) == -1) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean i(int i) {
        switch (this.a) {
            case 0:
                if (i < this.d && this.c <= i) {
                    return twe.m(Character.codePointAt(this.b, i));
                }
                return false;
            default:
                if (i < this.d && this.c <= i) {
                    return uwe.m(Character.codePointAt(this.b, i));
                }
                return false;
        }
    }

    public int j(int i) {
        a(i);
        int following = this.e.following(i);
        if (h(following - 1) && h(following) && !f(following)) {
            return j(following);
        }
        return following;
    }

    public int k(int i) {
        a(i);
        int preceding = this.e.preceding(i);
        if (h(preceding) && c(preceding) && !f(preceding)) {
            return k(preceding);
        }
        return preceding;
    }
}
