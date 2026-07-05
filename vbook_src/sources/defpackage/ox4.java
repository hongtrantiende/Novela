package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ox4  reason: default package */
/* loaded from: classes.dex */
public final class ox4 extends px4 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox4(CharSequence charSequence, int i) {
        super(charSequence, "android.credentials.GetCredentialException.TYPE_INTERRUPTED");
        switch (i) {
            case 2:
                super(charSequence, "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION");
                return;
            case 3:
                super(charSequence, "android.credentials.GetCredentialException.TYPE_UNKNOWN");
                return;
            case 4:
            default:
                return;
            case 5:
                super(charSequence, "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL");
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox4(int i, CharSequence charSequence, String str) {
        super(charSequence, str);
        switch (i) {
            case 4:
                super(charSequence, str);
                if (str.length() > 0) {
                    return;
                }
                vs.m("type must not be empty");
                throw null;
            default:
                if (str.length() > 0) {
                    return;
                }
                vs.m("type must not be empty");
                throw null;
        }
    }

    public ox4(x xVar, String str) {
        this(4, str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(xVar.a));
    }
}
