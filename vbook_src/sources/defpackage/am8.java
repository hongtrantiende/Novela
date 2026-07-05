package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Window;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: am8  reason: default package */
/* loaded from: classes3.dex */
public abstract class am8 {
    public static final tu1 a = new tu1(new xu1(3), false, -356642060);
    public static final tu1 b = new tu1(new wu1(22), false, 964371439);
    public static final Object c = new Object();
    public static volatile e60 d;

    public static final void A(z1 z1Var, String str) {
        z1Var.q("Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.", z1Var.b - 1);
        throw null;
    }

    public static final float B(tu7 tu7Var, tu7 tu7Var2, float f) {
        int nextInt;
        int i;
        float c2;
        tu7Var.getClass();
        tu7Var2.getClass();
        if (nae.e <= f && f <= 1.0f) {
            Iterator it = dce.F(0, tu7Var.b).iterator();
            while (true) {
                sy5 sy5Var = (sy5) it;
                if (sy5Var.c) {
                    nextInt = sy5Var.nextInt();
                    float b2 = tu7Var.b(nextInt);
                    i = nextInt + 1;
                    float b3 = tu7Var.b(i % tu7Var.b);
                    if (b3 >= b2) {
                        if (b2 <= f && f <= b3) {
                            break;
                        }
                    } else if (f >= b2 || f <= b3) {
                        break;
                    }
                } else {
                    p1a.l("Collection contains no element matching the predicate.");
                    return nae.e;
                }
            }
            int i2 = i % tu7Var.b;
            float c3 = d2d.c(tu7Var.b(i2) - tu7Var.b(nextInt));
            float c4 = d2d.c(tu7Var2.b(i2) - tu7Var2.b(nextInt));
            if (c3 < 0.001f) {
                c2 = 0.5f;
            } else {
                c2 = d2d.c(f - tu7Var.b(nextInt)) / c3;
            }
            return d2d.c((c4 * c2) + tu7Var2.b(nextInt));
        }
        throw new IllegalArgumentException(("Invalid progress: " + f).toString());
    }

    public static final CharSequence C(CharSequence charSequence, int i) {
        String str;
        int length;
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i == -1) {
                if (charSequence.length() - 60 > 0) {
                    return "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i2 = i - 30;
                int i3 = i + 30;
                if (i2 > 0) {
                    str = ".....";
                } else {
                    str = "";
                }
                if (i3 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length2 = charSequence.length();
                if (i3 > length2) {
                    i3 = length2;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
        }
        return charSequence;
    }

    public static final String D(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        String str2 = ". ";
        if (str != null) {
            str2 = hl5.n(" with key ", str, ". ");
        }
        return s21.q(sb, str2, "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static final float E(float f, float f2) {
        float abs = Math.abs(f - f2);
        return Math.min(abs, 1.0f - abs);
    }

    public static final void F(tu7 tu7Var) {
        tu7Var.getClass();
        int i = tu7Var.b;
        if (i != 0) {
            float f = tu7Var.a[i - 1];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                float b2 = tu7Var.b(i2);
                if (b2 >= nae.e && b2 < 1.0f) {
                    if (E(b2, f) > 1.0E-4f) {
                        if (b2 < f && (i3 = i3 + 1) > 1) {
                            p1a.k("FloatMapping - Progress wraps more than once: ".concat(tu7.c(tu7Var, 31)));
                            return;
                        } else {
                            i2++;
                            f = b2;
                        }
                    } else {
                        p1a.k("FloatMapping - Progress repeats a value: ".concat(tu7.c(tu7Var, 31)));
                        return;
                    }
                } else {
                    p1a.k("FloatMapping - Progress outside of range: ".concat(tu7.c(tu7Var, 31)));
                    return;
                }
            }
            return;
        }
        p1a.l("FloatList is empty.");
    }

    public static Status G(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, null, null, null);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && (str2 = split[1]) != null) {
            split[1] = str2.trim();
        }
        List asList = Arrays.asList(split);
        if (asList.size() > 1) {
            return H((String) asList.get(0), (String) asList.get(1));
        }
        return H((String) asList.get(0), null);
    }

    public static Status H(String str, String str2) {
        int i;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    c2 = 0;
                    break;
                }
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    c2 = 1;
                    break;
                }
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    c2 = 2;
                    break;
                }
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    c2 = 3;
                    break;
                }
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    c2 = 5;
                    break;
                }
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    c2 = 6;
                    break;
                }
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    c2 = 7;
                    break;
                }
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -1584641425:
                if (str.equals("UNAUTHORIZED_DOMAIN")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    c2 = '\f';
                    break;
                }
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    c2 = '\r';
                    break;
                }
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    c2 = 14;
                    break;
                }
                break;
            case -1368998244:
                if (str.equals("INVALID_HOSTING_LINK_DOMAIN")) {
                    c2 = 15;
                    break;
                }
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    c2 = 16;
                    break;
                }
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    c2 = 17;
                    break;
                }
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    c2 = 18;
                    break;
                }
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    c2 = 19;
                    break;
                }
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    c2 = 20;
                    break;
                }
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    c2 = 21;
                    break;
                }
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    c2 = 22;
                    break;
                }
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    c2 = 23;
                    break;
                }
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    c2 = 24;
                    break;
                }
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    c2 = 25;
                    break;
                }
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    c2 = 26;
                    break;
                }
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    c2 = 27;
                    break;
                }
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    c2 = 28;
                    break;
                }
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    c2 = 29;
                    break;
                }
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    c2 = 30;
                    break;
                }
                break;
            case -406804866:
                if (str.equals("INVALID_LOGIN_CREDENTIALS")) {
                    c2 = 31;
                    break;
                }
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    c2 = ' ';
                    break;
                }
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    c2 = '!';
                    break;
                }
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    c2 = '\"';
                    break;
                }
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    c2 = '#';
                    break;
                }
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    c2 = '$';
                    break;
                }
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    c2 = '%';
                    break;
                }
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    c2 = '&';
                    break;
                }
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    c2 = '\'';
                    break;
                }
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    c2 = '(';
                    break;
                }
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    c2 = ')';
                    break;
                }
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    c2 = '*';
                    break;
                }
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    c2 = '+';
                    break;
                }
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    c2 = ',';
                    break;
                }
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    c2 = '-';
                    break;
                }
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    c2 = '.';
                    break;
                }
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    c2 = '/';
                    break;
                }
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    c2 = '0';
                    break;
                }
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    c2 = '1';
                    break;
                }
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    c2 = '2';
                    break;
                }
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    c2 = '3';
                    break;
                }
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    c2 = '4';
                    break;
                }
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    c2 = '5';
                    break;
                }
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    c2 = '6';
                    break;
                }
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    c2 = '7';
                    break;
                }
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    c2 = '8';
                    break;
                }
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    c2 = '9';
                    break;
                }
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    c2 = ':';
                    break;
                }
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    c2 = ';';
                    break;
                }
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    c2 = '<';
                    break;
                }
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    c2 = '=';
                    break;
                }
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    c2 = '>';
                    break;
                }
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    c2 = '?';
                    break;
                }
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    c2 = '@';
                    break;
                }
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    c2 = 'A';
                    break;
                }
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    c2 = 'B';
                    break;
                }
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    c2 = 'C';
                    break;
                }
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    c2 = 'D';
                    break;
                }
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    c2 = 'E';
                    break;
                }
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    c2 = 'F';
                    break;
                }
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    c2 = 'G';
                    break;
                }
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    c2 = 'H';
                    break;
                }
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    c2 = 'I';
                    break;
                }
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    c2 = 'J';
                    break;
                }
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    c2 = 'K';
                    break;
                }
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    c2 = 'L';
                    break;
                }
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    c2 = 'M';
                    break;
                }
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    c2 = 'N';
                    break;
                }
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    c2 = 'O';
                    break;
                }
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    c2 = 'P';
                    break;
                }
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    c2 = 'Q';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                i = 18001;
                break;
            case 1:
                i = 17033;
                break;
            case 2:
                i = 17057;
                break;
            case 3:
                i = 17091;
                break;
            case 4:
            case 31:
            case Token.ENUM_INIT_VALUES /* 64 */:
                i = 17004;
                break;
            case 5:
                i = 17068;
                break;
            case 6:
                i = 17052;
                break;
            case 7:
                i = 17061;
                break;
            case '\b':
                i = 17206;
                break;
            case '\t':
                i = 17200;
                break;
            case '\n':
                i = 17029;
                break;
            case 11:
                i = 17038;
                break;
            case '\f':
                i = 17030;
                break;
            case '\r':
                i = 17034;
                break;
            case 14:
                i = 17044;
                break;
            case 15:
                i = 17214;
                break;
            case 16:
                i = 17021;
                break;
            case 17:
                i = 17079;
                break;
            case 18:
                i = 18002;
                break;
            case 19:
                i = 17046;
                break;
            case 20:
                i = 17087;
                break;
            case 21:
            case Token.GET_REF /* 73 */:
                i = 17008;
                break;
            case 22:
                i = 17085;
                break;
            case 23:
                i = 17094;
                break;
            case 24:
                i = 17064;
                break;
            case 25:
                i = 17016;
                break;
            case 26:
                i = 17084;
                break;
            case 27:
                i = 17035;
                break;
            case 28:
                i = 17014;
                break;
            case 29:
            case Token.ENUM_NEXT /* 67 */:
                i = 17020;
                break;
            case 30:
                i = 17207;
                break;
            case ' ':
                i = 17203;
                break;
            case Token.GETPROP /* 33 */:
            case Token.SHNE /* 52 */:
                i = 17006;
                break;
            case Token.GETPROPNOWARN /* 34 */:
                i = 17062;
                break;
            case Token.GETPROP_SUPER /* 35 */:
                i = 17088;
                break;
            case Token.GETPROPNOWARN_SUPER /* 36 */:
                i = 17082;
                break;
            case Token.SETPROP /* 37 */:
            case Token.GETELEM_SUPER /* 40 */:
                i = 17011;
                break;
            case Token.SETPROP_SUPER /* 38 */:
                i = 17056;
                break;
            case Token.GETELEM /* 39 */:
                i = 17026;
                break;
            case Token.SETELEM /* 41 */:
                i = 17089;
                break;
            case Token.SETELEM_SUPER /* 42 */:
                i = 17032;
                break;
            case Token.CALL /* 43 */:
                i = 17041;
                break;
            case Token.NAME /* 44 */:
                i = 17074;
                break;
            case Token.NUMBER /* 45 */:
                i = 17081;
                break;
            case Token.STRING /* 46 */:
                i = 17095;
                break;
            case Token.NULL /* 47 */:
                i = 17007;
                break;
            case Token.THIS /* 48 */:
                i = 17017;
                break;
            case Token.FALSE /* 49 */:
                i = 17065;
                break;
            case Token.TRUE /* 50 */:
                i = 17204;
                break;
            case Token.SHEQ /* 51 */:
                i = 17205;
                break;
            case Token.REGEXP /* 53 */:
                i = 17086;
                break;
            case Token.BINDNAME /* 54 */:
                i = 17075;
                break;
            case Token.THROW /* 55 */:
                i = 17083;
                break;
            case Token.RETHROW /* 56 */:
                i = 17049;
                break;
            case Token.IN /* 57 */:
                i = 17071;
                break;
            case Token.INSTANCEOF /* 58 */:
                i = 17002;
                break;
            case Token.LOCAL_LOAD /* 59 */:
                i = 17058;
                break;
            case Token.GETVAR /* 60 */:
                i = 17078;
                break;
            case Token.SETVAR /* 61 */:
                i = 17093;
                break;
            case Token.CATCH_SCOPE /* 62 */:
                i = 17031;
                break;
            case Token.ENUM_INIT_KEYS /* 63 */:
            case Token.REF_SPECIAL /* 77 */:
                i = 17010;
                break;
            case Token.ENUM_INIT_ARRAY /* 65 */:
                i = 17000;
                break;
            case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                i = 17009;
                break;
            case Token.ENUM_ID /* 68 */:
                i = 17202;
                break;
            case Token.THISFN /* 69 */:
                i = 17051;
                break;
            case Token.RETURN_RESULT /* 70 */:
                i = 17043;
                break;
            case Token.ARRAYLIT /* 71 */:
                i = 17025;
                break;
            case Token.OBJECTLIT /* 72 */:
                i = 17201;
                break;
            case Token.SET_REF /* 74 */:
                i = 17005;
                break;
            case Token.DEL_REF /* 75 */:
                i = 17042;
                break;
            case Token.REF_CALL /* 76 */:
                i = 17028;
                break;
            case Token.YIELD /* 78 */:
                i = 17040;
                break;
            case Token.SUPER /* 79 */:
                i = 17045;
                break;
            case Token.STRICT_SETNAME /* 80 */:
                i = 17090;
                break;
            case Token.EXP /* 81 */:
                i = 17073;
                break;
            default:
                i = 17499;
                break;
        }
        if (i == 17499) {
            if (str2 != null) {
                return new Status(i, eub.o(str, ":", str2), null, null);
            }
            return new Status(i, str, null, null);
        }
        return new Status(i, str2, null, null);
    }

    public static final void a(vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        boolean z2;
        vkd vkdVar;
        rv4Var.g0(480840370);
        int i3 = i | 6;
        if (rv4Var.h(vt4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i4 = i3 | i2;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                tx txVar = (tx) ((fdd) voe.z(cm9.a(tx.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z3 = jsc.z(txVar.G, rv4Var);
                Boolean valueOf = Boolean.valueOf(((ex) z3.getValue()).a);
                boolean f = rv4Var.f(z3);
                if ((i4 & Token.ASSIGN_MOD) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z2 | f;
                Object P = rv4Var.P();
                Object obj = ax1.a;
                bu1 bu1Var = null;
                if (z4 || P == obj) {
                    P = new db(vt4Var, z3, null, 4);
                    rv4Var.o0(P);
                }
                yte.g((lu4) P, rv4Var, valueOf);
                aw7 z5 = jsc.z(txVar.H, rv4Var);
                float f2 = gwe.f(rv4Var).a;
                if (rg3.a(f2, nae.e) >= 0) {
                    if (rg3.a(f2, 600.0f) < 0) {
                        vkdVar = vkd.a;
                    } else if (rg3.a(f2, 960.0f) < 0) {
                        vkdVar = vkd.b;
                    } else if (rg3.a(f2, 1024.0f) < 0) {
                        vkdVar = vkd.c;
                    } else if (rg3.a(f2, 1366.0f) < 0) {
                        vkdVar = vkd.d;
                    } else {
                        vkdVar = vkd.e;
                    }
                    Object j = rv4Var.j(at6.a);
                    if (j instanceof bu1) {
                        bu1Var = (bu1) j;
                    }
                    if (bu1Var != null) {
                        Object P2 = rv4Var.P();
                        if (P2 == obj) {
                            P2 = yae.z(wfb.a);
                            rv4Var.o0(P2);
                        }
                        aw7 aw7Var = (aw7) P2;
                        if (((vfb) aw7Var.getValue()).a == null) {
                            rv4Var.e0(-1723099833);
                            Window window = bu1Var.getWindow();
                            window.getClass();
                            rm rmVar = new rm(window);
                            boolean h = rv4Var.h(bu1Var) | rv4Var.h(rmVar);
                            Object P3 = rv4Var.P();
                            if (h || P3 == obj) {
                                P3 = new a0b(3, bu1Var, rmVar);
                                rv4Var.o0(P3);
                            }
                            yte.k((vt4) P3, rv4Var);
                            aw7Var.setValue(new vfb(rmVar));
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(-1722578010);
                            rv4Var.q(false);
                        }
                        i99 a3 = idd.b.a(kv6.a(rv4Var));
                        i99 a4 = ikd.a.a(vkdVar);
                        i99 a5 = nm3.b.a((vfb) aw7Var.getValue());
                        tza tzaVar = dy1.o;
                        List z0 = k4b.z0(((ex) z3.getValue()).b, new String[]{","});
                        ArrayList arrayList = new ArrayList(z0.size());
                        int size = z0.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            arrayList.add(k4b.N0((String) z0.get(i5)).toString());
                        }
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int i6 = 0;
                        for (int size2 = arrayList.size(); i6 < size2; size2 = size2) {
                            arrayList2.add(new nv6((String) arrayList.get(i6)));
                            i6++;
                        }
                        pye.b(new i99[]{a3, a4, a5, tzaVar.a(new ov6(arrayList2))}, jce.E(-278503950, new ax(z5, txVar, z3), rv4Var), rv4Var, 48);
                    } else {
                        vs.k("No ComponentActivity provided of composables.");
                        return;
                    }
                } else {
                    vs.m("Dp value cannot be negative");
                    return;
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new zr(vt4Var, i, 1);
        }
    }

    public static final void b(tx txVar, x6c x6cVar, om3 om3Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        tx txVar2 = txVar;
        rv4Var.g0(-342862493);
        if (rv4Var.f(txVar2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var.f(x6cVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.f(om3Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            q0a a2 = o96.a(rv4Var);
            boolean f = rv4Var.f(null) | rv4Var.f(a2);
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (f || P == obj) {
                P = a2.e(cm9.a(io5.class), null, null);
                rv4Var.o0(P);
            }
            io5 io5Var = (io5) P;
            tza tzaVar = qj4.a;
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = new mj4();
                rv4Var.o0(P2);
            }
            mj4 mj4Var = (mj4) P2;
            lz7[] lz7VarArr = {a07.INSTANCE};
            Object[] objArr = new Object[0];
            ru3 ru3Var = new ru3(new mz7());
            boolean h = rv4Var.h(lz7VarArr);
            Object P3 = rv4Var.P();
            if (h || P3 == obj) {
                P3 = new ak9(lz7VarArr, 3);
                rv4Var.o0(P3);
            }
            gy9 gy9Var = gy9.c;
            dz7 dz7Var = (dz7) zpe.l(Arrays.copyOf(objArr, 0), new yy9(new f58(8, ru3Var, gy9Var), new cn9(10, ru3Var, gy9Var)), (vt4) P3, rv4Var, 384);
            boolean f2 = rv4Var.f(dz7Var);
            Object P4 = rv4Var.P();
            if (f2 || P4 == obj) {
                P4 = new cz7(dz7Var);
                rv4Var.o0(P4);
            }
            cz7 cz7Var = (cz7) P4;
            Object P5 = rv4Var.P();
            if (P5 == obj) {
                P5 = new ws2();
                rv4Var.o0(P5);
            }
            ws2 ws2Var = (ws2) P5;
            Context context = (Context) rv4Var.j(gh.b);
            Object P6 = rv4Var.P();
            if (P6 == obj) {
                while (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        P6 = new tl((Activity) context);
                        rv4Var.o0(P6);
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        context.getClass();
                    }
                }
                vs.k("Permissions should be called in the context of an Activity");
                return;
            }
            tl tlVar = (tl) P6;
            tza tzaVar2 = e1c.a;
            Object P7 = rv4Var.P();
            if (P7 == obj) {
                P7 = new lzb();
                rv4Var.o0(P7);
            }
            lzb lzbVar = (lzb) P7;
            rxa rxaVar = rxa.e;
            Object P8 = rv4Var.P();
            if (P8 == obj) {
                P8 = yte.s(rv4Var);
                rv4Var.o0(P8);
            }
            m82 m82Var = (m82) P8;
            Object P9 = rv4Var.P();
            if (P9 == obj) {
                P9 = new uxa(m82Var, rxaVar);
                rv4Var.o0(P9);
            }
            uxa uxaVar = (uxa) P9;
            boolean f3 = rv4Var.f(uxaVar);
            Object P10 = rv4Var.P();
            if (f3 || P10 == obj) {
                P10 = new kb(uxaVar);
                rv4Var.o0(P10);
            }
            kb kbVar = (kb) P10;
            Object P11 = rv4Var.P();
            if (P11 == obj) {
                P11 = yte.s(rv4Var);
                rv4Var.o0(P11);
            }
            m82 m82Var2 = (m82) P11;
            Object P12 = rv4Var.P();
            if (P12 == obj) {
                P12 = new zxa(m82Var2);
                rv4Var.o0(P12);
            }
            zxa zxaVar = (zxa) P12;
            boolean f4 = rv4Var.f(zxaVar);
            Object P13 = rv4Var.P();
            if (f4 || P13 == obj) {
                P13 = new sac(zxaVar);
                rv4Var.o0(P13);
            }
            txVar2 = txVar;
            pye.b(new i99[]{qj4.a.a(mj4Var), do5.a.a(io5Var), u0a.a.a(tlVar), r12.a.a(new zl1(((h27) rv4Var.j(j27.a)).a.q)), e1c.a.a(lzbVar), sf0.a.a(ws2Var), yb.a.a(kbVar), uac.a.a((sac) P13)}, jce.E(1146681891, new sh7(txVar2, kbVar, x6cVar, ws2Var, cz7Var, lzbVar, mj4Var, uxaVar, zxaVar, om3Var, 2), rv4Var), rv4Var, 48);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ax(txVar2, x6cVar, om3Var, i);
        }
    }

    public static final void c(final boolean z, final mv mvVar, final String str, final float f, final boolean z2, final nq7 nq7Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        nq7 nq7Var2;
        String str2;
        float f2;
        rv4 rv4Var2;
        ek9 u;
        lu4 lu4Var;
        rv4Var.g0(1777381811);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.d(mvVar.ordinal())) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.f(str)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.c(f)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.g(z2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((74899 & i11) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i11 & 1, z3)) {
            if (z) {
                u = rv4Var.u();
                if (u != null) {
                    lu4Var = new lu4(z, mvVar, str, f, z2, nq7Var, i, 0) { // from class: zw
                        public final /* synthetic */ nq7 C;
                        public final /* synthetic */ int a;
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ mv c;
                        public final /* synthetic */ String d;
                        public final /* synthetic */ float e;
                        public final /* synthetic */ boolean f;

                        {
                            this.a = r8;
                        }

                        @Override // defpackage.lu4
                        public final Object invoke(Object obj, Object obj2) {
                            int i12 = this.a;
                            pvc pvcVar = pvc.a;
                            switch (i12) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int p = xoe.p(196609);
                                    am8.c(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p);
                                    return pvcVar;
                                default:
                                    ((Integer) obj2).getClass();
                                    int p2 = xoe.p(196609);
                                    am8.c(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p2);
                                    return pvcVar;
                            }
                        }
                    };
                    u.d = lu4Var;
                }
                return;
            }
            str2 = str;
            f2 = f;
            switch (mvVar.ordinal()) {
                case 1:
                    rv4Var2 = rv4Var;
                    rv4Var2.e0(1624996885);
                    if (!k4b.j0(str2)) {
                        rv4Var2.e0(1625042703);
                        nq7Var2 = nq7Var;
                        do5.a(new zq9(str2), r0f.d, false, null, null, null, lpe.m(nq7Var2, dce.m(f2, nae.e, 1.0f)), null, rv4Var, 48, 892);
                        rv4Var2 = rv4Var;
                        rv4Var2.q(false);
                    } else {
                        nq7Var2 = nq7Var;
                        rv4Var2.e0(1625319471);
                        rv4Var2.q(false);
                    }
                    rv4Var2.q(false);
                    break;
                case 2:
                    rv4Var2 = rv4Var;
                    rv4Var2.e0(-1333042162);
                    jbe.c(nq7Var, false, nae.e, z2, rv4Var2, 6 | ((i11 >> 3) & 7168));
                    rv4Var2.q(false);
                    nq7Var2 = nq7Var;
                    break;
                case 3:
                    rv4Var2 = rv4Var;
                    rv4Var2.e0(-1333039253);
                    dxe.f(nq7Var, false, nae.e, z2, rv4Var2, 6 | ((i11 >> 3) & 7168), 6);
                    rv4Var2.q(false);
                    nq7Var2 = nq7Var;
                    break;
                case 4:
                    rv4Var2 = rv4Var;
                    rv4Var2.e0(-1333036423);
                    ie2.d(pna.c, false, nae.e, z2, rv4Var2, ((i11 >> 3) & 7168) | 6, 6);
                    rv4Var2.q(false);
                    nq7Var2 = nq7Var;
                    break;
                case 5:
                    rv4Var2 = rv4Var;
                    rv4Var2.e0(-1333033008);
                    ade.i(nq7Var, false, nae.e, z2, rv4Var2, 6 | ((i11 >> 3) & 7168), 6);
                    rv4Var2.q(false);
                    nq7Var2 = nq7Var;
                    break;
                case 6:
                    rv4Var2 = rv4Var;
                    rv4Var2.e0(-1333030004);
                    qre.m(nq7Var, false, nae.e, z2, rv4Var2, 6 | ((i11 >> 3) & 7168));
                    rv4Var2.q(false);
                    nq7Var2 = nq7Var;
                    break;
                case 7:
                    rv4Var2 = rv4Var;
                    rv4Var2.e0(-1333027091);
                    iue.C(nq7Var, false, nae.e, z2, rv4Var2, 6 | ((i11 >> 3) & 7168), 6);
                    rv4Var2.q(false);
                    nq7Var2 = nq7Var;
                    break;
                case 8:
                    rv4Var2 = rv4Var;
                    rv4Var2.e0(-1333024213);
                    gwe.b(nq7Var, false, nae.e, z2, rv4Var2, 6 | ((i11 >> 3) & 7168), 6);
                    rv4Var2.q(false);
                    nq7Var2 = nq7Var;
                    break;
                case 9:
                    rv4Var.e0(-1333021364);
                    rv4Var2 = rv4Var;
                    kwe.e(nq7Var, false, nae.e, z2, rv4Var2, 6 | ((i11 >> 3) & 7168), 6);
                    rv4Var2.q(false);
                    nq7Var2 = nq7Var;
                    break;
                default:
                    rv4Var.e0(1626083373);
                    rv4Var.q(false);
                    nq7Var2 = nq7Var;
                    rv4Var2 = rv4Var;
                    break;
            }
        } else {
            nq7Var2 = nq7Var;
            str2 = str;
            f2 = f;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        u = rv4Var2.u();
        if (u != null) {
            final String str3 = str2;
            final float f3 = f2;
            final nq7 nq7Var3 = nq7Var2;
            lu4Var = new lu4(z, mvVar, str3, f3, z2, nq7Var3, i, 1) { // from class: zw
                public final /* synthetic */ nq7 C;
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ mv c;
                public final /* synthetic */ String d;
                public final /* synthetic */ float e;
                public final /* synthetic */ boolean f;

                {
                    this.a = r8;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    int i12 = this.a;
                    pvc pvcVar = pvc.a;
                    switch (i12) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int p = xoe.p(196609);
                            am8.c(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p);
                            return pvcVar;
                        default:
                            ((Integer) obj2).getClass();
                            int p2 = xoe.p(196609);
                            am8.c(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p2);
                            return pvcVar;
                    }
                }
            };
            u.d = lu4Var;
        }
    }

    public static final p46 d(o9a o9aVar) {
        String str = "Value of type '" + o9aVar.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + o9aVar.e() + '\'';
        o9aVar.a();
        return new p46(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c3, code lost:
        if (r4 == r1) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(int r41, defpackage.xt4 r42, defpackage.rv4 r43, defpackage.nq7 r44, java.util.List r45) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am8.e(int, xt4, rv4, nq7, java.util.List):void");
    }

    public static final void f(g13 g13Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        g13Var.getClass();
        xt4Var.getClass();
        rv4Var.g0(-1224227726);
        if (rv4Var.f(g13Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z2 = false;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            boolean booleanValue = ((Boolean) g13Var.a.getValue()).booleanValue();
            if ((i5 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new fo4(g13Var, 28);
                rv4Var.o0(P);
            }
            xb.d(booleanValue, (xt4) P, jce.E(-207921722, new bf7(g13Var, xt4Var), rv4Var), null, null, jce.E(-1657419831, new sj(g13Var, 28), rv4Var), zxe.c, null, 0L, 0L, nae.e, false, false, zxe.d, rv4Var, 1769856, 8088);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new bf7(g13Var, xt4Var, i);
        }
    }

    public static final void g(boolean z, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        pb2 pb2Var;
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(-851506065);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                aw7 z3 = jsc.z(((tb6) ((fdd) voe.z(cm9.a(tb6.class), a2.i(), null, pb2Var, o96.a(rv4Var), null))).c, rv4Var);
                if (ikd.a(rv4Var)) {
                    rv4Var.e0(-1140010302);
                    int i8 = i7 & 14;
                    int i9 = i7 << 3;
                    h(z, ((sb6) z3.getValue()).a, xt4Var, xt4Var2, rv4Var, i8 | (i9 & 896) | (i9 & 7168));
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-1139765433);
                    int i10 = i7 & 14;
                    int i11 = i7 << 3;
                    i(z, ((sb6) z3.getValue()).a, xt4Var, xt4Var2, rv4Var, i10 | (i11 & 896) | (i11 & 7168));
                    rv4Var.q(false);
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kr3(z, xt4Var, xt4Var2, i, 4);
        }
    }

    public static final void h(boolean z, List list, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        xt4 xt4Var3;
        boolean z2;
        int i4;
        int i5;
        rv4Var.g0(-161986343);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if ((i & 384) == 0) {
            xt4Var3 = xt4Var;
            if (rv4Var.h(xt4Var3)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i7 |= i5;
        } else {
            xt4Var3 = xt4Var;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i7 |= i4;
        }
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            nmd.d(z, xt4Var3, null, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(-1131559427, new ld1(list, mwe.g(14, rv4Var), xt4Var2, 22), rv4Var), rv4Var, (i7 & 14) | 3072 | ((i7 >> 3) & Token.ASSIGN_MOD), 48, 2036);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new aj7(z, list, xt4Var, xt4Var2, i, 1);
        }
    }

    public static final void i(boolean z, List list, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        xt4 xt4Var3;
        boolean z2;
        int i4;
        int i5;
        rv4Var.g0(-2131805929);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if ((i & 384) == 0) {
            xt4Var3 = xt4Var;
            if (rv4Var.h(xt4Var3)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i7 |= i5;
        } else {
            xt4Var3 = xt4Var;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i7 |= i4;
        }
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            xb.d(z, xt4Var3, null, null, null, null, null, null, 0L, 0L, nae.e, false, false, jce.E(-1967003925, new sv4(20, list, xt4Var2), rv4Var), rv4Var, (i7 & 14) | ((i7 >> 3) & Token.ASSIGN_MOD), 8188);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new aj7(z, list, xt4Var, xt4Var2, i, 0);
        }
    }

    public static final void j(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-115153971);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = true;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                fla flaVar = (fla) ((fdd) voe.z(cm9.a(fla.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z3 = jsc.z(flaVar.d, rv4Var);
                kb kbVar = (kb) rv4Var.j(yb.a);
                ae0 ae0Var = (ae0) rv4Var.j(dy1.d);
                s02 s02Var = flaVar.e;
                boolean f = rv4Var.f(kbVar);
                if ((i3 & 14) != 4) {
                    z2 = false;
                }
                boolean z4 = f | z2;
                Object P = rv4Var.P();
                if (z4 || P == ax1.a) {
                    P = new we1(kbVar, cz7Var, (m42) null, 14);
                    rv4Var.o0(P);
                }
                jye.b(s02Var, null, (mu4) P, rv4Var, 0);
                fxe.h(yqe.A((y3b) o2b.j.getValue(), rv4Var), null, false, jce.E(850208585, new ri9(cz7Var, 7), rv4Var), null, null, jce.E(1877073112, new cs1(13, flaVar, ae0Var, z3), rv4Var), rv4Var, 1575936, 54);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ri9(cz7Var, i, 8);
        }
    }

    public static final void k(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        long j;
        rv4Var.g0(76332761);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            if (nae.p(rv4Var)) {
                j = zl1.b;
            } else {
                j = zl1.e;
            }
            nq7 v = nmd.v(nq7Var, j, lre.g);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, v);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            dxe.h(rp5.b((wk3) ok3.n.getValue(), rv4Var, 0), "", pna.n(pu0.a.a(kq7.a, kh5.e), 288.0f), null, r0f.e, nae.e, null, rv4Var, 24632, Token.ASSIGN_LOGICAL_AND);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 2);
        }
    }

    public static final void l(final boolean z, final xt4 xt4Var, nq7 nq7Var, final long j, final long j2, final long j3, final float f, final float f2, final boolean z2, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        final kq7 kq7Var;
        float f3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        rv4Var.g0(-588319721);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i11 | i3 | 384;
        if (rv4Var.e(j)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i13 = i12 | i4;
        if (rv4Var.e(j2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i14 = i13 | i5;
        if (rv4Var.e(j3)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i15 = i14 | i6;
        if (rv4Var.c(f)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i16 = i15 | i7;
        if (rv4Var.c(f2)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i17 = i16 | i8;
        if (rv4Var.c(2.0f)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i18 = i17 | i9;
        if (rv4Var.g(z2)) {
            i10 = 536870912;
        } else {
            i10 = 268435456;
        }
        int i19 = i18 | i10;
        if ((306783379 & i19) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i19 & 1, z3)) {
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = nae.e;
            }
            final yya b2 = nq.b(f3, tte.x(180, 0, null, 6), "CheckboxProgress", rv4Var, 3120, 20);
            su9 a2 = uu9.a(f2);
            kq7 kq7Var2 = kq7.a;
            nq7 Z = h9a.Z(tte.k(pna.n(kq7Var2, f), a2), z, z2, new xt9(1), xt4Var);
            if ((234881024 & i19) == 67108864) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((29360128 & i19) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z10 = z4 | z5;
            if ((458752 & i19) == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z11 = z10 | z6;
            if ((i19 & 7168) == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean f4 = z11 | z7 | rv4Var.f(b2);
            if ((i19 & 57344) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z12 = z8 | f4;
            Object P = rv4Var.P();
            if (!z12 && P != ax1.a) {
                z9 = false;
            } else {
                z9 = false;
                Object obj = new xt4() { // from class: ibc
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj2) {
                        u41 u41Var = (u41) obj2;
                        u41Var.getClass();
                        final float f5 = u41Var.f() * 2.0f;
                        final float f6 = u41Var.f() * f2;
                        final float c2 = dna.c(u41Var.a.b());
                        final float f7 = f5 / 2.0f;
                        yj a3 = dk.a();
                        a3.i(0.22f * c2, 0.5f * c2);
                        a3.h(0.4f * c2, 0.68f * c2);
                        a3.h(0.78f * c2, 0.3f * c2);
                        final bk bkVar = new bk(new PathMeasure());
                        bkVar.b(a3);
                        final long j4 = j3;
                        final long j5 = j;
                        final long j6 = j2;
                        final yya yyaVar = b2;
                        return u41Var.a(new t41(0, new xt4() { // from class: kbc
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj3) {
                                float f8;
                                yya yyaVar2;
                                float f9;
                                ak3 ak3Var = (ak3) obj3;
                                ak3Var.getClass();
                                yya yyaVar3 = yyaVar;
                                float floatValue = ((Number) yyaVar3.getValue()).floatValue();
                                long j7 = j4;
                                long j8 = j5;
                                long q = sve.q(floatValue, j7, j8);
                                int i20 = (((Number) yyaVar3.getValue()).floatValue() > nae.e ? 1 : (((Number) yyaVar3.getValue()).floatValue() == nae.e ? 0 : -1));
                                float f10 = f6;
                                if (i20 > 0) {
                                    f8 = f10;
                                    yyaVar2 = yyaVar3;
                                    f9 = 0.0f;
                                    ak3.Y(ak3Var, j8, 0L, 0L, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L), null, ((Number) yyaVar3.getValue()).floatValue(), 214);
                                } else {
                                    f8 = f10;
                                    yyaVar2 = yyaVar3;
                                    f9 = 0.0f;
                                }
                                float f11 = f7;
                                long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
                                float f12 = c2;
                                float f13 = f5;
                                float f14 = f12 - f13;
                                ak3.Y(ak3Var, q, floatToRawIntBits, (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32), (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), new s4b(f13, nae.e, 0, 0, null, 30), nae.e, 224);
                                if (((Number) yyaVar2.getValue()).floatValue() > f9) {
                                    yj a4 = dk.a();
                                    bk bkVar2 = bkVar;
                                    bkVar2.a(f9, ((Number) yyaVar2.getValue()).floatValue() * bkVar2.a.getLength(), a4);
                                    ak3.t1(ak3Var, a4, j6, nae.e, new s4b(f13, nae.e, 1, 1, null, 18), 52);
                                }
                                return pvc.a;
                            }
                        }));
                    }
                };
                rv4Var.o0(obj);
                P = obj;
            }
            nq7 s = ote.s(Z, (xt4) P);
            b37 d2 = fu0.d(kh5.e, z9);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, s);
            rw1.k.getClass();
            vt4 vt4Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            rv4Var.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(z, xt4Var, kq7Var, j, j2, j3, f, f2, z2, i) { // from class: jbc
                public final /* synthetic */ float C;
                public final /* synthetic */ float D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ xt4 b;
                public final /* synthetic */ nq7 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int p2 = xoe.p(1);
                    am8.l(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, (rv4) obj2, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static void m(String str, boolean z) {
        if (z) {
            return;
        }
        vs.m(str);
    }

    public static void n(boolean z) {
        if (z) {
            return;
        }
        p1a.g();
    }

    public static void o(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            int length = String.valueOf(name).length();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length + 35 + 1);
            nk2.C(sb, "Must be called on ", name, " thread, but got ", str);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void p(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        vs.m("Given String is empty or null");
    }

    public static void q(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        vs.m(str2);
    }

    public static void r(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        vs.k(str);
    }

    public static void s(Object obj) {
        if (obj != null) {
            return;
        }
        xk5.k("null reference");
    }

    public static void t(Object obj, String str) {
        if (obj != null) {
            return;
        }
        xk5.k(str);
    }

    public static void u(String str, boolean z) {
        if (z) {
            return;
        }
        vs.k(str);
    }

    public static void v(boolean z) {
        if (z) {
            return;
        }
        vm1.d();
    }

    public static final ij1 w(xt4 xt4Var, String str, vt4 vt4Var) {
        vt4Var.getClass();
        return new ij1(str, vt4Var, xt4Var);
    }

    public static final String x(String str, yq2 yq2Var) {
        yq2Var.getClass();
        return "Cannot deserialize " + str + " with '" + cm9.a(yq2Var.getClass()).g() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final String y(String str, jbe jbeVar) {
        jbeVar.getClass();
        return "Cannot serialize " + str + " with '" + cm9.a(jbeVar.getClass()).g() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }

    public static final String z(String str, int i, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !k4b.j0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !k4b.j0(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }
}
