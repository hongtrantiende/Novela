package defpackage;

import java.util.List;
import java.util.regex.Matcher;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b27  reason: default package */
/* loaded from: classes.dex */
public final class b27 {
    public final Matcher a;
    public final CharSequence b;
    public final a27 c;
    public z17 d;

    public b27(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new a27(this, 0);
    }

    public final List a() {
        if (this.d == null) {
            this.d = new z17(this);
        }
        z17 z17Var = this.d;
        z17Var.getClass();
        return z17Var;
    }

    public final ty5 b() {
        Matcher matcher = this.a;
        return dce.F(matcher.start(), matcher.end());
    }

    public final String c() {
        String group = this.a.group();
        group.getClass();
        return group;
    }

    public final b27 d() {
        int i;
        Matcher matcher = this.a;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        CharSequence charSequence = this.b;
        if (i2 <= charSequence.length()) {
            Matcher matcher2 = matcher.pattern().matcher(charSequence);
            matcher2.getClass();
            return p1d.f(matcher2, i2, charSequence);
        }
        return null;
    }
}
