package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mv6  reason: default package */
/* loaded from: classes3.dex */
public final class mv6 {
    public static final p69 b = new Object();
    public final n07 a;

    public mv6(n07 n07Var) {
        this.a = n07Var;
    }

    public final String a() {
        String country = ((Locale) this.a.b).getCountry();
        country.getClass();
        return country;
    }

    public final String b() {
        Locale a = pv6.b().a(0);
        if (a == null) {
            a = Locale.getDefault();
        }
        a.getClass();
        String displayLanguage = ((Locale) this.a.b).getDisplayLanguage(a);
        displayLanguage.getClass();
        return displayLanguage;
    }

    public final String c(mv6 mv6Var) {
        String displayLanguage = ((Locale) this.a.b).getDisplayLanguage((Locale) mv6Var.a.b);
        displayLanguage.getClass();
        return displayLanguage;
    }

    public final String d() {
        String language = ((Locale) this.a.b).getLanguage();
        language.getClass();
        return language;
    }

    public final String e() {
        String languageTag = ((Locale) this.a.b).toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }

    public final String toString() {
        return this.a.toString();
    }
}
