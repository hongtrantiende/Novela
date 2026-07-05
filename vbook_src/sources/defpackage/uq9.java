package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uq9  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class uq9 extends xu4 implements vt4 {
    public static final uq9 a = new xu4(0, wq9.class, "getSystemEnvironment", "getSystemEnvironment()Lorg/jetbrains/compose/resources/ResourceEnvironment;", 1);

    @Override // defpackage.vt4
    public final Object invoke() {
        boolean z;
        h6c h6cVar;
        v13 v13Var;
        Locale locale = Locale.getDefault();
        Configuration configuration = Resources.getSystem().getConfiguration();
        if ((configuration.uiMode & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        int i = configuration.densityDpi;
        String language = locale.getLanguage();
        language.getClass();
        ub6 ub6Var = new ub6(language);
        String country = locale.getCountry();
        country.getClass();
        km9 km9Var = new km9(country);
        h6c.a.getClass();
        if (z) {
            h6cVar = h6c.c;
        } else {
            h6cVar = h6c.b;
        }
        v13.b.getClass();
        if (i <= 120) {
            v13Var = v13.c;
        } else if (i <= 160) {
            v13Var = v13.d;
        } else if (i <= 240) {
            v13Var = v13.e;
        } else if (i <= 320) {
            v13Var = v13.f;
        } else if (i <= 480) {
            v13Var = v13.C;
        } else {
            v13Var = v13.D;
        }
        return new sq9(ub6Var, km9Var, h6cVar, v13Var);
    }
}
