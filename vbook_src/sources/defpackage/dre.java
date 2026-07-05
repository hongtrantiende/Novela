package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dre  reason: default package */
/* loaded from: classes.dex */
public final class dre extends qve {
    public static final Pair V = new Pair("", 0L);
    public final o40 C;
    public String D;
    public boolean E;
    public long F;
    public final jya G;
    public final oqe H;
    public final o40 I;
    public final odd J;
    public final oqe K;
    public final jya L;
    public final jya M;
    public boolean N;
    public final oqe O;
    public final oqe P;
    public final jya Q;
    public final o40 R;
    public final o40 S;
    public final jya T;
    public final odd U;
    public SharedPreferences c;
    public SharedPreferences d;
    public zqe e;
    public final jya f;

    public dre(lte lteVar) {
        super(lteVar);
        this.G = new jya(this, "session_timeout", 1800000L);
        this.H = new oqe(this, "start_new_session", true);
        this.L = new jya(this, "last_pause_time", 0L);
        this.M = new jya(this, "session_id", 0L);
        this.I = new o40(this, "non_personalized_ads");
        this.J = new odd(this, "last_received_uri_timestamps_by_source");
        this.K = new oqe(this, "allow_remote_dynamite", false);
        this.f = new jya(this, "first_open_time", 0L);
        am8.p("app_install_time");
        this.C = new o40(this, "app_instance_id");
        this.O = new oqe(this, "app_backgrounded", false);
        this.P = new oqe(this, "deep_link_retrieval_complete", false);
        this.Q = new jya(this, "deep_link_retrieval_attempts", 0L);
        this.R = new o40(this, "firebase_feature_rollouts");
        this.S = new o40(this, "deferred_attribution_cache");
        this.T = new jya(this, "deferred_attribution_cache_timestamp", 0L);
        this.U = new odd(this, "default_event_parameters");
    }

    @Override // defpackage.qve
    public final boolean Y() {
        return true;
    }

    public final SharedPreferences b0() {
        W();
        Z();
        am8.s(this.c);
        return this.c;
    }

    public final SharedPreferences c0() {
        W();
        Z();
        if (this.d == null) {
            lte lteVar = (lte) this.a;
            String valueOf = String.valueOf(lteVar.a.getPackageName());
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            s56 s56Var = ppeVar.J;
            String concat = valueOf.concat("_preferences");
            s56Var.f(concat, "Default prefs file");
            this.d = lteVar.a.getSharedPreferences(concat, 0);
        }
        return this.d;
    }

    public final SparseArray d0() {
        Bundle b = this.J.b();
        int[] intArray = b.getIntArray("uriSources");
        long[] longArray = b.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                ppe ppeVar = ((lte) this.a).f;
                lte.m(ppeVar);
                ppeVar.f.e("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray = new SparseArray();
            for (int i = 0; i < intArray.length; i++) {
                sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
            }
            return sparseArray;
        }
        return new SparseArray();
    }

    public final hwe e0() {
        W();
        return hwe.c(b0().getInt("consent_source", 100), b0().getString("consent_settings", "G1"));
    }

    public final void f0(boolean z) {
        W();
        ppe ppeVar = ((lte) this.a).f;
        lte.m(ppeVar);
        ppeVar.J.f(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = b0().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final boolean g0(long j) {
        if (j - this.G.g() > this.L.g()) {
            return true;
        }
        return false;
    }
}
