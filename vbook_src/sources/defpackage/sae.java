package defpackage;

import java.util.Calendar;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sae  reason: default package */
/* loaded from: classes.dex */
public final class sae extends qve {
    public long c;
    public String d;

    @Override // defpackage.qve
    public final boolean Y() {
        Calendar calendar = Calendar.getInstance();
        this.c = (calendar.get(16) + calendar.get(15)) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.d = nk2.v(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long b0() {
        Z();
        return this.c;
    }

    public final String c0() {
        Z();
        return this.d;
    }
}
