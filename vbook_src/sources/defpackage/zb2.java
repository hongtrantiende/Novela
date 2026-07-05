package defpackage;

import android.credentials.Credential;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zb2  reason: default package */
/* loaded from: classes.dex */
public final class zb2 implements OutcomeReceiver {
    public final /* synthetic */ uwd a;

    public zb2(uwd uwdVar, ac2 ac2Var) {
        this.a = uwdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            android.credentials.GetCredentialException r5 = (android.credentials.GetCredentialException) r5
            r5.getClass()
            java.lang.String r0 = "CredManProvService"
            java.lang.String r1 = "GetCredentialResponse error returned from framework"
            android.util.Log.i(r0, r1)
            java.lang.String r0 = r5.getType()
            r0.getClass()
            java.lang.String r5 = r5.getMessage()
            int r1 = r0.hashCode()
            switch(r1) {
                case -781118336: goto L6f;
                case -408155724: goto L60;
                case -45448328: goto L50;
                case 580557411: goto L41;
                case 627896683: goto L30;
                case 1594095913: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L77
        L1f:
            java.lang.String r1 = "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L28
            goto L77
        L28:
            ox4 r0 = new ox4
            r1 = 2
            r0.<init>(r5, r1)
            goto Lb0
        L30:
            java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L39
            goto L77
        L39:
            ox4 r0 = new ox4
            r1 = 5
            r0.<init>(r5, r1)
            goto Lb0
        L41:
            java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_USER_CANCELED"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4a
            goto L77
        L4a:
            nx4 r0 = new nx4
            r0.<init>(r5)
            goto Lb0
        L50:
            java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_INTERRUPTED"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L59
            goto L77
        L59:
            ox4 r0 = new ox4
            r1 = 1
            r0.<init>(r5, r1)
            goto Lb0
        L60:
            java.lang.String r1 = "androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L69
            goto L77
        L69:
            sx4 r0 = new sx4
            r0.<init>(r5)
            goto Lb0
        L6f:
            java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_UNKNOWN"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Laa
        L77:
            java.lang.String r1 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
            r2 = 0
            boolean r3 = defpackage.r4b.Q(r0, r1, r2)
            if (r3 == 0) goto La4
            int r3 = defpackage.ox4.a
            if (r5 == 0) goto L89
            java.lang.String r5 = r5.toString()
            goto L8a
        L89:
            r5 = 0
        L8a:
            boolean r1 = defpackage.r4b.Q(r0, r1, r2)     // Catch: defpackage.ft4 -> L9d
            if (r1 == 0) goto L97
            int r1 = defpackage.ox4.a     // Catch: defpackage.ft4 -> L9d
            px4 r0 = defpackage.jce.w(r0, r5)     // Catch: defpackage.ft4 -> L9d
            goto Lb0
        L97:
            ft4 r1 = new ft4     // Catch: defpackage.ft4 -> L9d
            r1.<init>()     // Catch: defpackage.ft4 -> L9d
            throw r1     // Catch: defpackage.ft4 -> L9d
        L9d:
            ox4 r1 = new ox4
            r1.<init>(r2, r5, r0)
        La2:
            r0 = r1
            goto Lb0
        La4:
            ox4 r1 = new ox4
            r1.<init>(r2, r5, r0)
            goto La2
        Laa:
            ox4 r0 = new ox4
            r1 = 3
            r0.<init>(r5, r1)
        Lb0:
            uwd r4 = r4.a
            r4.r(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb2.onError(java.lang.Throwable):void");
    }

    public final void onResult(Object obj) {
        l4 ge2Var;
        l4 l4Var;
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
        getCredentialResponse.getClass();
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        Credential credential = getCredentialResponse.getCredential();
        credential.getClass();
        String type = credential.getType();
        type.getClass();
        Bundle data = credential.getData();
        data.getClass();
        try {
        } catch (ft4 unused) {
            ge2Var = new ge2(type, data);
        }
        switch (type.hashCode()) {
            case -1678407252:
                if (type.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                    try {
                        String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                        string.getClass();
                        l4Var = new l4("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", data);
                        if (string.length() != 0) {
                            try {
                                new JSONObject(string);
                                ge2Var = l4Var;
                                this.a.s(new rx4(ge2Var));
                                return;
                            } catch (Exception unused2) {
                            }
                        }
                        throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
                    } catch (Exception unused3) {
                        throw new Exception();
                    }
                }
                throw new Exception();
            case -1072734346:
                if (type.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                    String string2 = data.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                    if (string2 != null) {
                        l4Var = new l4("androidx.credentials.TYPE_RESTORE_CREDENTIAL", data);
                        if (string2.length() != 0) {
                            try {
                                new JSONObject(string2);
                                ge2Var = l4Var;
                                this.a.s(new rx4(ge2Var));
                                return;
                            } catch (Exception unused4) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new ox4("The device does not contain a restore credential.", 5);
                }
                throw new Exception();
            case -543568185:
                if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    try {
                        String string3 = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                        String string4 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                        string3.getClass();
                        string4.getClass();
                        l4Var = new s63(string4, 1, data);
                        ge2Var = l4Var;
                        this.a.s(new rx4(ge2Var));
                        return;
                    } catch (Exception unused5) {
                        throw new Exception();
                    }
                }
                throw new Exception();
            case -95037569:
                if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    try {
                        String string5 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                        string5.getClass();
                        ge2Var = new s63(string5, 2, data);
                        this.a.s(new rx4(ge2Var));
                        return;
                    } catch (Exception unused6) {
                        throw new Exception();
                    }
                }
                throw new Exception();
            default:
                throw new Exception();
        }
    }
}
