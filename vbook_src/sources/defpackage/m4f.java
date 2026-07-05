package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m4f  reason: default package */
/* loaded from: classes.dex */
public abstract class m4f {
    public static final mm9 a = qs5.t("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(zyd zydVar, rm9 rm9Var, rm9 rm9Var2, xma xmaVar, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        k4f k4fVar;
        char c;
        int c2 = c(zydVar);
        if (c2 > 0 && (i2 != 1 || i != 1)) {
            cArr[c2] = '2';
        }
        if (g(zydVar, rm9Var2) == azd.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else if (zydVar == zyd.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && xmaVar.d.equals(str)) {
            if (c2 > 0 && cArr[c2] != '2') {
                cArr[c2] = '1';
            }
            return true;
        } else {
            if (rm9Var.containsKey(zydVar) && (k4fVar = (k4f) rm9Var.get(zydVar)) != null) {
                int ordinal = k4fVar.ordinal();
                azd azdVar = azd.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (ordinal != 0) {
                    azd azdVar2 = azd.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                if (g(zydVar, rm9Var2) == azdVar2) {
                                    return e(zydVar, cArr, str2, z);
                                }
                                return f(zydVar, cArr, str3, z2);
                            }
                        } else if (g(zydVar, rm9Var2) == azdVar) {
                            return f(zydVar, cArr, str3, z2);
                        } else {
                            return e(zydVar, cArr, str2, z);
                        }
                    } else if (g(zydVar, rm9Var2) != azdVar2) {
                        return f(zydVar, cArr, str3, z2);
                    }
                } else if (g(zydVar, rm9Var2) != azdVar) {
                    return e(zydVar, cArr, str2, z);
                }
                c = '8';
            }
            c = '0';
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
            return false;
        }
        return false;
    }

    public static final int c(zyd zydVar) {
        if (zydVar == zyd.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zydVar == zyd.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zydVar == zyd.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        if (zydVar == zyd.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE) {
            return 4;
        }
        return -1;
    }

    public static final String d(zyd zydVar, String str, String str2) {
        String str3;
        String str4 = "0";
        if (TextUtils.isEmpty(str) || str.length() < zydVar.zza()) {
            str3 = "0";
        } else {
            str3 = String.valueOf(str.charAt(zydVar.zza() - 1));
        }
        if (!TextUtils.isEmpty(str2) && str2.length() >= zydVar.zza()) {
            str4 = String.valueOf(str2.charAt(zydVar.zza() - 1));
        }
        return String.valueOf(str3).concat(String.valueOf(str4));
    }

    public static final boolean e(zyd zydVar, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(zydVar);
        boolean z2 = false;
        if (!z) {
            c = '4';
        } else if (str.length() < zydVar.zza()) {
            c = '0';
        } else {
            char charAt = str.charAt(zydVar.zza() - 1);
            char c3 = '1';
            if (charAt == '1') {
                z2 = true;
            }
            if (c2 > 0 && cArr[c2] != '2') {
                if (charAt != '1') {
                    c3 = '6';
                }
                cArr[c2] = c3;
            }
            return z2;
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final boolean f(zyd zydVar, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(zydVar);
        boolean z2 = false;
        if (!z) {
            c = '5';
        } else if (str.length() < zydVar.zza()) {
            c = '0';
        } else {
            char charAt = str.charAt(zydVar.zza() - 1);
            char c3 = '1';
            if (charAt == '1') {
                z2 = true;
            }
            if (c2 > 0 && cArr[c2] != '2') {
                if (charAt != '1') {
                    c3 = '7';
                }
                cArr[c2] = c3;
            }
            return z2;
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final azd g(zyd zydVar, rm9 rm9Var) {
        Object obj = rm9Var.get(zydVar);
        if (obj == null) {
            obj = azd.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (azd) obj;
    }
}
