package defpackage;

import android.net.Uri;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n5  reason: default package */
/* loaded from: classes.dex */
public final class n5 {
    public static final /* synthetic */ int c = 0;
    public final String a;
    public final String b;

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r7v6 short[], r7v8 ??, r7v7 ??, r7v9 byte[]]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.tryInsertAdditionalMove(TypeInferenceVisitor.java:742)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:109)
        */
    static {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5.<clinit>():void");
    }

    public n5(String str) {
        String a = a(str, "apiKey");
        String a2 = a(str, "oobCode");
        String a3 = a(str, "mode");
        if (a != null && a2 != null && a3 != null) {
            am8.p(a);
            am8.p(a2);
            this.a = a2;
            am8.p(a3);
            a(str, "continueUrl");
            a(str, "lang");
            this.b = a(str, "tenantId");
            return;
        }
        vs.m("apiKey, oobCode and mode are required in a valid action code URL");
        throw null;
    }

    public static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                String queryParameter = parse.getQueryParameter("link");
                am8.p(queryParameter);
                return Uri.parse(queryParameter).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
