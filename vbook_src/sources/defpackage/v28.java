package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.security.GeneralSecurityException;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v28  reason: default package */
/* loaded from: classes.dex */
public final class v28 implements t94, iy8, ad, Continuation, ace, x5f, k3f, q3f, ym3, b1e {
    public final /* synthetic */ int a;
    public static final /* synthetic */ v28 b = new v28(9);
    public static final /* synthetic */ v28 c = new v28(11);
    public static final /* synthetic */ v28 d = new v28(12);
    public static final /* synthetic */ v28 e = new v28(13);
    public static final /* synthetic */ v28 f = new v28(14);
    public static final /* synthetic */ v28 C = new v28(16);
    public static final /* synthetic */ v28 D = new v28(17);
    public static final /* synthetic */ v28 E = new v28(18);
    public static final /* synthetic */ v28 F = new v28(19);
    public static final /* synthetic */ v28 G = new v28(21);
    public static final /* synthetic */ v28 H = new v28(22);

    public v28(oza ozaVar) {
        this.a = 4;
    }

    public static Typeface e(String str, dq4 dq4Var, int i) {
        if (i == 0 && c16.i(dq4Var, dq4.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int l = hu7.l(dq4Var, i);
        if (str != null && str.length() != 0) {
            return Typeface.create(str, l);
        }
        return Typeface.defaultFromStyle(l);
    }

    @Override // defpackage.iy8
    public Typeface a(dq4 dq4Var, int i) {
        return e(null, dq4Var, i);
    }

    @Override // defpackage.ym3
    public c4 b(Context context, String str, xm3 xm3Var) {
        int d2;
        c4 c4Var = new c4();
        int f2 = xm3Var.f(context, str);
        c4Var.a = f2;
        int i = 1;
        int i2 = 0;
        if (f2 != 0) {
            d2 = xm3Var.d(context, str, false);
            c4Var.b = d2;
        } else {
            d2 = xm3Var.d(context, str, true);
            c4Var.b = d2;
        }
        int i3 = c4Var.a;
        if (i3 == 0) {
            if (d2 == 0) {
                i = 0;
                c4Var.c = i;
                return c4Var;
            }
        } else {
            i2 = i3;
        }
        if (i2 >= d2) {
            i = -1;
        }
        c4Var.c = i;
        return c4Var;
    }

    @Override // defpackage.x5f
    public s6f c(bfe bfeVar) {
        eif eifVar;
        ske skeVar = (ske) bfeVar;
        mgf t = ogf.t();
        t.f("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        mhf t2 = nhf.t();
        String str = skeVar.a;
        t2.c();
        nhf.v((nhf) t2.b, str);
        t.g(((nhf) t2.b()).b());
        zhe zheVar = skeVar.b;
        if (zhe.D != zheVar) {
            if (zhe.E == zheVar) {
                eifVar = eif.RAW;
            } else {
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zheVar)));
            }
        } else {
            eifVar = eif.TINK;
        }
        t.e(eifVar);
        return s6f.Q((ogf) t.b());
    }

    @Override // defpackage.iy8
    public Typeface d(uw4 uw4Var, dq4 dq4Var, int i) {
        String str = uw4Var.f;
        int i2 = dq4Var.a / 100;
        if (i2 >= 0 && i2 < 2) {
            str = str.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            str = str.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                str = str.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                str = str.concat("-black");
            }
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface e2 = e(str, dq4Var, i);
            if (!c16.i(e2, Typeface.create(Typeface.DEFAULT, hu7.l(dq4Var, i))) && !c16.i(e2, e(null, dq4Var, i))) {
                typeface = e2;
            }
        }
        if (typeface == null) {
            return e(uw4Var.f, dq4Var, i);
        }
        return typeface;
    }

    public void f(uwd uwdVar, int i, Bundle bundle) {
        Bundle bundle2;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                ((iw5) uwdVar.b).l();
                Object t = ((iw5) uwdVar.b).t();
                t.getClass();
                Parcelable parcelable = (Parcelable) t;
                if (bundle == null) {
                    bundle2 = new Bundle();
                } else {
                    bundle2 = new Bundle(bundle);
                }
                bundle = bundle2;
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e2) {
                e2.toString();
                return;
            }
        }
        ClipDescription description = ((iw5) uwdVar.b).getDescription();
        iw5 iw5Var = (iw5) uwdVar.b;
        new ClipData(description, new ClipData.Item(iw5Var.g()));
        iw5Var.getDescription();
        iw5Var.m();
        if (bundle == null) {
            Bundle bundle3 = Bundle.EMPTY;
        }
    }

    @Override // defpackage.ad
    public void i(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // defpackage.q3f
    public t6f k(s9e s9eVar) {
        switch (this.a) {
            case 24:
                rie rieVar = (rie) s9eVar;
                vpe.c(rieVar.f);
                acf w = ccf.w();
                byte[] b2 = ((hlf) rieVar.g.b).b();
                w6e e2 = s6e.e(b2, 0, b2.length);
                w.c();
                ccf.v((ccf) w.b, e2);
                return t6f.p("type.googleapis.com/google.crypto.tink.AesGcmKey", ((ccf) w.b()).b(), 2, vpe.b(rieVar.f.d), rieVar.i);
            default:
                r7f r7fVar = (r7f) s9eVar;
                ief x = jef.x();
                h8f h8fVar = r7fVar.f;
                uef x2 = vef.x();
                int i = h8fVar.b;
                x2.c();
                vef.u((vef) x2.b, i);
                x2.c();
                vef.v((vef) x2.b, (lef) a9f.b.r(h8fVar.d));
                x.c();
                jef.w((jef) x.b, (vef) x2.b());
                byte[] b3 = ((hlf) r7fVar.g.b).b();
                w6e e3 = s6e.e(b3, 0, b3.length);
                x.c();
                jef.v((jef) x.b, e3);
                return t6f.p("type.googleapis.com/google.crypto.tink.HmacKey", ((jef) x.b()).b(), 2, (eif) a9f.a.r(r7fVar.f.c), r7fVar.h);
        }
    }

    @Override // defpackage.k3f
    public s9e n(t6f t6fVar) {
        switch (this.a) {
            case 23:
                if (((String) t6fVar.c).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    try {
                        taf u = taf.u((s6e) t6fVar.e, g7e.a);
                        if (u.t() == 0) {
                            if (u.y().t() == 0) {
                                if (u.z().t() == 0) {
                                    yv b2 = bie.b();
                                    b2.L(u.y().z().b());
                                    b2.N(u.z().A().b());
                                    b2.Q(u.y().y().t());
                                    b2.T(u.z().z().t());
                                    b2.e = noe.b(u.z().z().w());
                                    b2.f = noe.a((eif) t6fVar.f);
                                    bie J = b2.J();
                                    odd oddVar = new odd(9, false);
                                    oddVar.c = null;
                                    oddVar.d = null;
                                    oddVar.e = null;
                                    oddVar.b = J;
                                    oddVar.c = new xk9(hlf.a(u.y().z().m()), 26);
                                    oddVar.d = new xk9(hlf.a(u.z().A().m()), 26);
                                    oddVar.e = (Integer) t6fVar.C;
                                    return oddVar.f();
                                }
                                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                            }
                            throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (w7e unused) {
                        hfd.j("Parsing AesCtrHmacAeadKey failed");
                        return null;
                    }
                }
                vs.m("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                return null;
            default:
                if (((String) t6fVar.c).equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    try {
                        kif u2 = kif.u((s6e) t6fVar.e, g7e.a);
                        if (u2.t() == 0) {
                            if (u2.z().b() == 32) {
                                return hne.E(rne.b(u2.y().t(), zte.a((eif) t6fVar.f)), new xk9(hlf.a(u2.z().m()), 26), (Integer) t6fVar.C);
                            }
                            throw new GeneralSecurityException("Only 32 byte key size is accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (w7e unused2) {
                        hfd.j("Parsing XAesGcmKey failed");
                        return null;
                    }
                }
                vs.m("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                return null;
        }
    }

    @Override // defpackage.t94
    public fjc s(int i, int i2) {
        return new n73();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new nk1(intent);
        }
        return null;
    }

    @Override // defpackage.ace
    /* renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 11:
                List list = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 1).get();
            case 12:
                List list2 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.store.max_stored_events_per_app", 100000L, 20).get()).longValue());
            case 13:
                List list3 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.sgtm.batch.retry_max_wait", 21600000L, 43).get();
            case 14:
                List list4 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("measurement.upload.interval", 3600000L, 65).get();
            case 15:
            case 20:
            default:
                List list5 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.upload.max_events_per_day", 100000L, 71).get()).longValue());
            case 16:
                List list6 = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.config.url_authority", "app-measurement.com", 7).get();
            case 17:
                List list7 = yme.a;
                p3e.b.get();
                return Integer.valueOf((int) ((Long) t3e.a.K("measurement.upload.max_bundles", 100L, 67).get()).longValue());
            case 18:
                List list8 = yme.a;
                p3e.b.get();
                return (String) t3e.a.O("measurement.rb.attribution.query_parameters_to_remove", "", 59).get();
            case 19:
                List list9 = yme.a;
                p3e.b.get();
                return (Long) t3e.a.K("45769094", 3600000L, 11).get();
            case 21:
                List list10 = yme.a;
                q5e.b.get();
                return (Boolean) r5e.a.A(8, "measurement.rb.attribution.uuid_generation", true).get();
        }
    }

    public /* synthetic */ v28(int i) {
        this.a = i;
    }

    @Override // defpackage.t94
    public void m() {
    }

    @Override // defpackage.t94
    public void v(m4a m4aVar) {
    }
}
