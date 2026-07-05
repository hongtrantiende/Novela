package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wb2  reason: default package */
/* loaded from: classes.dex */
public final class wb2 extends yb2 {
    public final Context d;
    public rb2 e;
    public Executor f;
    public CancellationSignal g;
    public final vb2 h;

    public wb2(Context context) {
        context.getClass();
        this.d = context;
        this.h = new vb2(this, new Handler(Looper.getMainLooper()), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rx4 d(vka vkaVar) {
        o70 o70Var;
        String jSONObject;
        l4 s63Var;
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        w99 w99Var = vkaVar.E;
        String str5 = vkaVar.C;
        String str6 = vkaVar.a;
        String str7 = vkaVar.f;
        boolean z = true;
        if (str7 != null) {
            str6.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str6);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str7);
            s63Var = new s63(str7, 1, bundle);
        } else {
            l4 l4Var = null;
            JSONObject jSONObject2 = null;
            if (str5 != null) {
                str6.getClass();
                String str8 = vkaVar.b;
                if (str8 != null) {
                    str = str8;
                } else {
                    str = null;
                }
                String str9 = vkaVar.c;
                if (str9 != null) {
                    str2 = str9;
                } else {
                    str2 = null;
                }
                String str10 = vkaVar.d;
                if (str10 != null) {
                    str3 = str10;
                } else {
                    str3 = null;
                }
                String str11 = vkaVar.D;
                if (str11 != null) {
                    str4 = str11;
                } else {
                    str4 = null;
                }
                Uri uri2 = vkaVar.e;
                if (uri2 != null) {
                    uri = uri2;
                } else {
                    uri = null;
                }
                l4Var = new o05(str6, str5, str, str3, str2, uri, str4);
            } else if (w99Var != null) {
                o70 o70Var2 = w99Var.f;
                m70 m70Var = w99Var.e;
                n70 n70Var = w99Var.d;
                LinkedHashMap linkedHashMap = x99.a;
                JSONObject jSONObject3 = new JSONObject();
                if (n70Var != 0) {
                    o70Var = n70Var;
                } else if (m70Var != 0) {
                    o70Var = m70Var;
                } else if (o70Var2 != null) {
                    o70Var = o70Var2;
                } else {
                    vs.k("No response set.");
                    return null;
                }
                if (o70Var instanceof o70) {
                    o70 o70Var3 = o70Var;
                    jw3 jw3Var = o70Var3.a;
                    jw3Var.getClass();
                    String str12 = o70Var3.b;
                    x xVar = (x) x99.a.get(jw3Var);
                    if (xVar != null) {
                        if (jw3Var != jw3.NOT_ALLOWED_ERR || str12 == null || !k4b.V(str12, "Unable to get sync account", false)) {
                            throw new ox4(xVar, str12);
                        }
                        throw new nx4("Passkey retrieval was cancelled by the user.");
                    }
                    throw new ox4(new x(26), s21.m("unknown fido gms exception - ", str12));
                }
                if (o70Var instanceof m70) {
                    try {
                        qpe qpeVar = w99Var.c;
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            if (qpeVar != null && qpeVar.i().length > 0) {
                                jSONObject4.put("rawId", jye.l(qpeVar.i()));
                            }
                            String str13 = w99Var.D;
                            if (str13 != null) {
                                jSONObject4.put("authenticatorAttachment", str13);
                            }
                            String str14 = w99Var.b;
                            if (str14 != null && o70Var2 == null) {
                                jSONObject4.put("type", str14);
                            }
                            String str15 = w99Var.a;
                            if (str15 != null) {
                                jSONObject4.put("id", str15);
                            }
                            String str16 = "response";
                            if (m70Var != 0) {
                                jSONObject2 = m70Var.e();
                            } else if (n70Var != 0) {
                                jSONObject2 = n70Var.e();
                            } else {
                                if (o70Var2 != null) {
                                    try {
                                        jSONObject2 = new JSONObject();
                                        jSONObject2.put("code", o70Var2.a.a);
                                        String str17 = o70Var2.b;
                                        if (str17 != null) {
                                            jSONObject2.put("message", str17);
                                        }
                                        str16 = "error";
                                    } catch (JSONException e) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                                    }
                                }
                                z = false;
                            }
                            if (jSONObject2 != null) {
                                jSONObject4.put(str16, jSONObject2);
                            }
                            k70 k70Var = w99Var.C;
                            if (k70Var != null) {
                                jSONObject4.put("clientExtensionResults", k70Var.c());
                            } else if (z) {
                                jSONObject4.put("clientExtensionResults", new JSONObject());
                            }
                            jSONObject = jSONObject4.toString();
                            jSONObject.getClass();
                        } catch (JSONException e2) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
                        }
                    } catch (Throwable th) {
                        throw new ox4("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage(), 3);
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(o70Var.getClass().getName()));
                    jSONObject = jSONObject3.toString();
                    jSONObject.getClass();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", jSONObject);
                s63Var = new s63(jSONObject, 2, bundle2);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
            }
            s63Var = l4Var;
        }
        if (s63Var != null) {
            return new rx4(s63Var);
        }
        throw new ox4("When attempting to convert get response, null credential found", 3);
    }

    public final rb2 e() {
        rb2 rb2Var = this.e;
        if (rb2Var != null) {
            return rb2Var;
        }
        c16.w("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f;
        if (executor != null) {
            return executor;
        }
        c16.w("executor");
        throw null;
    }
}
