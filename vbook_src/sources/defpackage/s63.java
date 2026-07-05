package defpackage;

import android.os.Bundle;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s63  reason: default package */
/* loaded from: classes.dex */
public final class s63 extends l4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s63(String str, int i, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        switch (i) {
            case 2:
                super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                vs.m("authenticationResponseJson must not be empty, and must be a valid JSON");
                throw null;
            default:
                if (str.length() > 0) {
                    return;
                }
                vs.m("password should not be empty");
                throw null;
        }
    }
}
