package defpackage;

import android.os.LocaleList;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pv6  reason: default package */
/* loaded from: classes.dex */
public final class pv6 {
    public static final pv6 b = c(new LocaleList(new Locale[0]));
    public final qv6 a;

    public pv6(qv6 qv6Var) {
        this.a = qv6Var;
    }

    public static pv6 b() {
        return c(LocaleList.getDefault());
    }

    public static pv6 c(LocaleList localeList) {
        return new pv6(new qv6(localeList));
    }

    public final Locale a(int i) {
        return this.a.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pv6) {
            if (this.a.equals(((pv6) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
