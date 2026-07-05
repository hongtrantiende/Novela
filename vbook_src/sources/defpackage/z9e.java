package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z9e  reason: default package */
/* loaded from: classes.dex */
public final class z9e extends f5f {
    public final x9e d;
    public final zg1 e;
    public static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] C = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] D = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] E = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
    public static final String[] F = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    public static final String[] G = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] H = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] I = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] J = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] K = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] L = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public z9e(a6f a6fVar) {
        super(a6fVar);
        this.e = new zg1(((lte) this.a).G);
        ((lte) this.a).getClass();
        this.d = new x9e(this, ((lte) this.a).a);
    }

    public static final String C0(List list) {
        if (list.isEmpty()) {
            return "";
        }
        return hl5.n(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void K0(ContentValues contentValues, Object obj) {
        am8.p(ES6Iterator.VALUE_PROPERTY);
        am8.s(obj);
        if (obj instanceof String) {
            contentValues.put(ES6Iterator.VALUE_PROPERTY, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(ES6Iterator.VALUE_PROPERTY, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(ES6Iterator.VALUE_PROPERTY, (Double) obj);
        } else {
            vs.m("Invalid value type");
        }
    }

    public final d6f A0(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        p0f p0fVar;
        lte lteVar = (lte) this.a;
        if (TextUtils.isEmpty(str2)) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.I.e("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            dte dteVar = (dte) e6f.I0(hte.A(), bArr);
            p0f[] values = p0f.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    p0fVar = values[i3];
                    if (p0fVar.a == i) {
                        break;
                    }
                    i3++;
                } else {
                    p0fVar = p0f.UNKNOWN;
                    break;
                }
            }
            if (p0fVar != p0f.GOOGLE_SIGNAL && p0fVar != p0f.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                for (nte nteVar : Collections.unmodifiableList(((hte) dteVar.b).t())) {
                    jte jteVar = (jte) nteVar.k();
                    jteVar.b();
                    ((nte) jteVar.b).X0(i2);
                    arrayList.add((nte) jteVar.d());
                }
                dteVar.b();
                ((hte) dteVar.b).F();
                dteVar.b();
                ((hte) dteVar.b).E(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    String str4 = split[i4];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        ppe ppeVar2 = lteVar.f;
                        lte.m(ppeVar2);
                        ppeVar2.f.f(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i4++;
                }
            }
            return new d6f(j, (hte) dteVar.d(), str2, hashMap, p0fVar, j2, j3, j4, i2);
        } catch (IOException e) {
            ppe ppeVar3 = lteVar.f;
            lte.m(ppeVar3);
            ppeVar3.f.g(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String B0() {
        ((lte) this.a).G.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) yme.S.a(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l + ")";
        String q = hl5.q(rs8.o(currentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > "), ((Long) yme.R.a(null)).longValue(), ")");
        StringBuilder sb = new StringBuilder(str.length() + 5 + q.length() + 1);
        nk2.C(sb, "(", str, " OR ", q);
        sb.append(")");
        return sb.toString();
    }

    public final void D0(String str, hwe hweVar) {
        am8.s(str);
        am8.s(hweVar);
        W();
        Y();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", hweVar.g());
        contentValues.put("consent_source", Integer.valueOf(hweVar.b));
        w0(contentValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List E0(String str) {
        ArrayList arrayList;
        String string;
        lte lteVar = (lte) this.a;
        W();
        Y();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase O0 = O0();
            O0.beginTransaction();
            Cursor cursor = null;
            try {
                try {
                    cursor = O0.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (!cursor.moveToFirst()) {
                        O0.setTransactionSuccessful();
                        arrayList = arrayList2;
                    } else {
                        boolean isEmpty = str.isEmpty();
                        do {
                            String string2 = cursor.getString(0);
                            if (cursor.isNull(1)) {
                                string = "";
                            } else {
                                string = cursor.getString(1);
                                am8.s(string);
                            }
                            if (string2 == null) {
                                ppe ppeVar = lteVar.f;
                                lte.m(ppeVar);
                                ppeVar.f.f(ppe.f0(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j = cursor.getLong(2);
                                yke t = ale.t();
                                t.b();
                                ((ale) t.b).u(string2);
                                t.b();
                                ((ale) t.b).x(j);
                                t.b();
                                ((ale) t.b).w(string);
                                if (isEmpty) {
                                    t.b();
                                    ((ale) t.b).v();
                                }
                                arrayList2.add((ale) t.d());
                            }
                        } while (cursor.moveToNext());
                        O0.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        O0.setTransactionSuccessful();
                        arrayList = arrayList2;
                    }
                } catch (SQLiteException e) {
                    ppe ppeVar2 = lteVar.f;
                    lte.m(ppeVar2);
                    ppeVar2.f.g(ppe.f0(str), e, "Error querying or deleting diagnostic signals. appId");
                    arrayList = Collections.EMPTY_LIST;
                }
                if (cursor != null) {
                    cursor.close();
                }
                O0.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                O0.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            ppe ppeVar3 = lteVar.f;
            lte.m(ppeVar3);
            ppeVar3.f.g(ppe.f0(str), e2, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void F0(String str, hwe hweVar) {
        am8.s(str);
        W();
        Y();
        D0(str, r0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", hweVar.g());
        w0(contentValues);
    }

    public final hwe G0(String str) {
        am8.s(str);
        W();
        Y();
        return hwe.c(100, v0("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final zae H0(String str, jse jseVar, String str2) {
        zae x0 = x0("events", str, jseVar.y());
        if (x0 == null) {
            lte lteVar = (lte) this.a;
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.E.g(ppe.f0(str), lteVar.F.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
            return new zae(str, jseVar.y(), 1L, 1L, 1L, jseVar.A(), 0L, null, null, null, null);
        }
        long j = x0.e + 1;
        long j2 = x0.d + 1;
        return new zae(x0.a, x0.b, x0.c + 1, j2, j, x0.f, x0.g, x0.h, x0.i, x0.j, x0.k);
    }

    public final boolean I0() {
        return ((lte) this.a).a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018c A[Catch: all -> 0x0079, SQLiteException -> 0x007c, LOOP:0: B:66:0x018c->B:74:0x01e6, LOOP_START, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e9 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0220 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J0(java.lang.String r21, long r22, long r24, defpackage.zqe r26) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.J0(java.lang.String, long, long, zqe):void");
    }

    public final void L0() {
        Y();
        O0().beginTransaction();
    }

    public final void M0() {
        Y();
        O0().setTransactionSuccessful();
    }

    public final void N0() {
        Y();
        O0().endTransaction();
    }

    public final SQLiteDatabase O0() {
        W();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.E.f(e, "Error opening database");
            throw e;
        }
    }

    public final void P0(String str) {
        zae x0;
        z0("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = O0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (x0 = x0("events", str, string)) != null) {
                            y0("events_snapshot", x0);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e) {
                ppe ppeVar = ((lte) this.a).f;
                lte.m(ppeVar);
                ppeVar.f.g(ppe.f0(str), e, "Error creating snapshot. appId");
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
        if (r8 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
        if (r8 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
        y0("events", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.Q0(java.lang.String):void");
    }

    public final void R0(String str, String str2) {
        am8.p(str);
        am8.p(str2);
        W();
        Y();
        try {
            O0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            lte lteVar = (lte) this.a;
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.f.h("Error deleting user property. appId", ppe.f0(str), lteVar.F.c(str2), e);
        }
    }

    public final boolean S0(j6f j6fVar) {
        lte lteVar = (lte) this.a;
        String str = j6fVar.b;
        W();
        Y();
        String str2 = j6fVar.a;
        String str3 = j6fVar.c;
        if (T0(str2, str3) == null) {
            if (l6f.Y0(str3)) {
                if (t0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(lteVar.d.g0(str2, yme.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long t0 = t0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                lteVar.getClass();
                if (t0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(j6fVar.d));
        K0(contentValues, j6fVar.e);
        try {
            if (O0().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.f.f(ppe.f0(str2), "Failed to insert/update user property (got -1). appId");
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.f.g(ppe.f0(str2), e, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.j6f T0(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.a
            r1 = r0
            lte r1 = (defpackage.lte) r1
            defpackage.am8.p(r12)
            defpackage.am8.p(r13)
            r11.W()
            r11.Y()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.O0()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r4 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r6 = "app_id=? and name=?"
            java.lang.String[] r7 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L37
            goto L95
        L37:
            r0 = 0
            long r8 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r10 = r11.k0(r3, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r10 != 0) goto L44
            goto L95
        L44:
            r11 = 2
            java.lang.String r6 = r3.getString(r11)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            j6f r4 = new j6f     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r11 = r3.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r11 == 0) goto L6d
            ppe r11 = r1.f     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            defpackage.lte.m(r11)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            s56 r11 = r11.f     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r12 = "Got multiple records for user property, expected one. appId"
            ope r13 = defpackage.ppe.f0(r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r11.f(r13, r12)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L67:
            r0 = move-exception
            r11 = r0
            goto L75
        L6a:
            r0 = move-exception
        L6b:
            r11 = r0
            goto L7f
        L6d:
            r3.close()
            return r4
        L71:
            r0 = move-exception
            r5 = r12
            r7 = r13
            goto L6b
        L75:
            r2 = r3
            goto L9b
        L77:
            r0 = move-exception
            r11 = r0
            goto L9b
        L7a:
            r0 = move-exception
            r5 = r12
            r7 = r13
            r11 = r0
            r3 = r2
        L7f:
            ppe r12 = r1.f     // Catch: java.lang.Throwable -> L67
            defpackage.lte.m(r12)     // Catch: java.lang.Throwable -> L67
            s56 r12 = r12.f     // Catch: java.lang.Throwable -> L67
            java.lang.String r13 = "Error querying user property. appId"
            ope r0 = defpackage.ppe.f0(r5)     // Catch: java.lang.Throwable -> L67
            yoe r1 = r1.F     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.c(r7)     // Catch: java.lang.Throwable -> L67
            r12.h(r13, r0, r1, r11)     // Catch: java.lang.Throwable -> L67
        L95:
            if (r3 == 0) goto L9a
            r3.close()
        L9a:
            return r2
        L9b:
            if (r2 == 0) goto La0
            r2.close()
        La0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.T0(java.lang.String, java.lang.String):j6f");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List U0(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.a
            r1 = r0
            lte r1 = (defpackage.lte) r1
            defpackage.am8.p(r13)
            r12.W()
            r12.Y()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1000"
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = r12.O0()     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L89
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L89
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L89
            java.lang.String r9 = "rowid"
            r1.getClass()     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L89
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L89
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L89
            if (r2 == 0) goto L9e
        L3f:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L89
            r2 = 1
            java.lang.String r2 = r11.getString(r2)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L89
            if (r2 != 0) goto L4d
            java.lang.String r2 = ""
        L4d:
            r5 = r2
            goto L53
        L4f:
            r0 = move-exception
            r12 = r0
            r4 = r13
            goto L8c
        L53:
            r2 = 2
            long r7 = r11.getLong(r2)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L89
            r2 = 3
            java.lang.Object r9 = r12.k0(r11, r2)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L89
            if (r9 != 0) goto L74
            ppe r2 = r1.f     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L71
            defpackage.lte.m(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L71
            s56 r2 = r2.f     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L71
            java.lang.String r3 = "Read invalid user property value, ignoring it. appId"
            ope r4 = defpackage.ppe.f0(r13)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L71
            r2.f(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L71
            r4 = r13
            goto L7d
        L71:
            r0 = move-exception
            r12 = r0
            goto La4
        L74:
            j6f r3 = new j6f     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L89
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L86
            r0.add(r3)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L86
        L7d:
            boolean r13 = r11.moveToNext()     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L86
            if (r13 != 0) goto L84
            goto L9e
        L84:
            r13 = r4
            goto L3f
        L86:
            r0 = move-exception
        L87:
            r12 = r0
            goto L8c
        L89:
            r0 = move-exception
            r4 = r13
            goto L87
        L8c:
            ppe r13 = r1.f     // Catch: java.lang.Throwable -> L71
            defpackage.lte.m(r13)     // Catch: java.lang.Throwable -> L71
            s56 r13 = r13.f     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = "Error querying user properties. appId"
            ope r1 = defpackage.ppe.f0(r4)     // Catch: java.lang.Throwable -> L71
            r13.g(r1, r12, r0)     // Catch: java.lang.Throwable -> L71
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L71
        L9e:
            if (r11 == 0) goto La3
            r11.close()
        La3:
            return r0
        La4:
            if (r11 == 0) goto La9
            r11.close()
        La9:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.U0(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
        defpackage.lte.m(r13);
        r13.f.f(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List V0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.V0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean W0(i4e i4eVar) {
        lte lteVar = (lte) this.a;
        W();
        Y();
        String str = i4eVar.a;
        am8.s(str);
        if (T0(str, i4eVar.c.b) == null) {
            long t0 = t0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            lteVar.getClass();
            if (t0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", i4eVar.b);
        contentValues.put("name", i4eVar.c.b);
        Object c = i4eVar.c.c();
        am8.s(c);
        K0(contentValues, c);
        contentValues.put("active", Boolean.valueOf(i4eVar.e));
        contentValues.put("trigger_event_name", i4eVar.f);
        contentValues.put("trigger_timeout", Long.valueOf(i4eVar.D));
        ibe ibeVar = i4eVar.C;
        l6f l6fVar = lteVar.E;
        ppe ppeVar = lteVar.f;
        lte.k(l6fVar);
        contentValues.put("timed_out_event", l6f.H0(ibeVar));
        contentValues.put("creation_timestamp", Long.valueOf(i4eVar.d));
        lte.k(l6fVar);
        contentValues.put("triggered_event", l6f.H0(i4eVar.E));
        contentValues.put("triggered_timestamp", Long.valueOf(i4eVar.c.c));
        contentValues.put("time_to_live", Long.valueOf(i4eVar.F));
        contentValues.put("expired_event", l6f.H0(i4eVar.G));
        try {
            if (O0().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                lte.m(ppeVar);
                ppeVar.f.f(ppe.f0(str), "Failed to insert/update conditional user property (got -1)");
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            lte.m(ppeVar);
            ppeVar.f.g(ppe.f0(str), e, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:29:0x00f0 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.i4e X0(java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.X0(java.lang.String, java.lang.String):i4e");
    }

    public final void Y0(String str, String str2) {
        am8.p(str);
        am8.p(str2);
        W();
        Y();
        try {
            O0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            lte lteVar = (lte) this.a;
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.f.h("Error deleting conditional property", ppe.f0(str), lteVar.F.c(str2), e);
        }
    }

    public final List Z0(String str, String str2, String str3) {
        am8.p(str);
        W();
        Y();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return a1(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // defpackage.f5f
    public final void a0() {
        lte lteVar = (lte) this.a;
        if (lteVar.d.i0(null, yme.e1)) {
            ete eteVar = lteVar.C;
            lte.m(eteVar);
            eteVar.g0(new og(this, 16));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0055, code lost:
        r0 = r1.f;
        defpackage.lte.m(r0);
        r0.f.f(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a1(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.a1(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final long b0(String str, hte hteVar, String str2, Map map, p0f p0fVar, Long l) {
        int delete;
        lte lteVar = (lte) this.a;
        W();
        Y();
        am8.s(hteVar);
        am8.p(str);
        W();
        Y();
        if (I0()) {
            a6f a6fVar = this.b;
            long g = a6fVar.E.f.g();
            kh5 kh5Var = lteVar.G;
            ppe ppeVar = lteVar.f;
            kh5Var.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - g) > ((Long) yme.M.a(null)).longValue()) {
                a6fVar.E.f.h(elapsedRealtime);
                W();
                Y();
                if (I0() && (delete = O0().delete("upload_queue", B0(), new String[0])) > 0) {
                    lte.m(ppeVar);
                    ppeVar.J.f(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                am8.p(str);
                W();
                Y();
                try {
                    int g0 = lteVar.d.g0(str, yme.A);
                    if (g0 > 0) {
                        O0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(g0)});
                    }
                } catch (SQLiteException e) {
                    lte.m(ppeVar);
                    ppeVar.f.g(ppe.f0(str), e, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] a = hteVar.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", a);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(p0fVar.a));
        kh5 kh5Var2 = lteVar.G;
        ppe ppeVar2 = lteVar.f;
        kh5Var2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long insert = O0().insert("upload_queue", null, contentValues);
            if (insert == -1) {
                lte.m(ppeVar2);
                ppeVar2.f.f(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
                return -1L;
            }
            return insert;
        } catch (SQLiteException e2) {
            lte.m(ppeVar2);
            ppeVar2.f.g(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0407  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hqe b1(java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.b1(java.lang.String):hqe");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final List c0(String str, a5f a5fVar, int i) {
        ?? r0;
        String str2;
        am8.p(str);
        W();
        Y();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase O0 = O0();
                String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
                String C0 = C0(a5fVar.a);
                String B0 = B0();
                StringBuilder sb = new StringBuilder(C0.length() + 17 + B0.length());
                sb.append("app_id=?");
                sb.append(C0);
                sb.append(" AND NOT ");
                sb.append(B0);
                String sb2 = sb.toString();
                String[] strArr2 = {str};
                if (i > 0) {
                    str2 = String.valueOf(i);
                } else {
                    str2 = null;
                }
                cursor = O0.query("upload_queue", strArr, sb2, strArr2, null, null, "creation_timestamp ASC", str2);
                r0 = new ArrayList();
                while (cursor.moveToNext()) {
                    d6f A0 = A0(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                    if (A0 != null) {
                        r0.add(A0);
                    }
                }
            } catch (SQLiteException e) {
                ppe ppeVar = ((lte) this.a).f;
                lte.m(ppeVar);
                ppeVar.f.g(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
                r0 = Collections.EMPTY_LIST;
            }
            return r0;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final void c1(hqe hqeVar, boolean z) {
        lte lteVar = (lte) this.a;
        lte lteVar2 = hqeVar.a;
        W();
        Y();
        String E2 = hqeVar.E();
        am8.s(E2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", E2);
        dwe dweVar = dwe.ANALYTICS_STORAGE;
        a6f a6fVar = this.b;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (a6fVar.a(E2).i(dweVar)) {
            contentValues.put("app_instance_id", hqeVar.F());
        }
        contentValues.put("gmp_app_id", hqeVar.H());
        if (a6fVar.a(E2).i(dwe.AD_STORAGE)) {
            ete eteVar = lteVar2.C;
            lte.m(eteVar);
            eteVar.W();
            contentValues.put("resettable_device_id_hash", hqeVar.e);
        }
        ete eteVar2 = lteVar2.C;
        lte.m(eteVar2);
        eteVar2.W();
        contentValues.put("last_bundle_index", Long.valueOf(hqeVar.g));
        ete eteVar3 = lteVar2.C;
        lte.m(eteVar3);
        eteVar3.W();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(hqeVar.h));
        ete eteVar4 = lteVar2.C;
        lte.m(eteVar4);
        eteVar4.W();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(hqeVar.i));
        contentValues.put("app_version", hqeVar.O());
        ete eteVar5 = lteVar2.C;
        lte.m(eteVar5);
        eteVar5.W();
        contentValues.put("app_store", hqeVar.l);
        ete eteVar6 = lteVar2.C;
        lte.m(eteVar6);
        eteVar6.W();
        contentValues.put("gmp_version", Long.valueOf(hqeVar.m));
        ete eteVar7 = lteVar2.C;
        lte.m(eteVar7);
        eteVar7.W();
        contentValues.put("dev_cert_hash", Long.valueOf(hqeVar.n));
        ete eteVar8 = lteVar2.C;
        lte.m(eteVar8);
        eteVar8.W();
        contentValues.put("measurement_enabled", Boolean.valueOf(hqeVar.o));
        ete eteVar9 = lteVar2.C;
        ete eteVar10 = lteVar2.C;
        lte.m(eteVar9);
        eteVar9.W();
        contentValues.put("day", Long.valueOf(hqeVar.K));
        lte.m(eteVar10);
        eteVar10.W();
        contentValues.put("daily_public_events_count", Long.valueOf(hqeVar.L));
        lte.m(eteVar10);
        eteVar10.W();
        contentValues.put("daily_events_count", Long.valueOf(hqeVar.M));
        lte.m(eteVar10);
        eteVar10.W();
        contentValues.put("daily_conversions_count", Long.valueOf(hqeVar.N));
        ete eteVar11 = lteVar2.C;
        lte.m(eteVar11);
        eteVar11.W();
        contentValues.put("config_fetched_time", Long.valueOf(hqeVar.S));
        ete eteVar12 = lteVar2.C;
        lte.m(eteVar12);
        eteVar12.W();
        contentValues.put("failed_config_fetch_time", Long.valueOf(hqeVar.T));
        contentValues.put("app_version_int", Long.valueOf(hqeVar.Q()));
        contentValues.put("firebase_instance_id", hqeVar.K());
        lte.m(eteVar10);
        eteVar10.W();
        contentValues.put("daily_error_events_count", Long.valueOf(hqeVar.O));
        lte.m(eteVar10);
        eteVar10.W();
        contentValues.put("daily_realtime_events_count", Long.valueOf(hqeVar.P));
        lte.m(eteVar10);
        eteVar10.W();
        contentValues.put("health_monitor_sample", hqeVar.Q);
        contentValues.put("android_id", (Long) 0L);
        ete eteVar13 = lteVar2.C;
        lte.m(eteVar13);
        eteVar13.W();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(hqeVar.p));
        contentValues.put("dynamite_version", Long.valueOf(hqeVar.b()));
        if (a6fVar.a(E2).i(dweVar)) {
            ete eteVar14 = lteVar2.C;
            lte.m(eteVar14);
            eteVar14.W();
            contentValues.put("session_stitching_token", hqeVar.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(hqeVar.z()));
        ete eteVar15 = lteVar2.C;
        lte.m(eteVar15);
        eteVar15.W();
        contentValues.put("target_os_version", Long.valueOf(hqeVar.v));
        ete eteVar16 = lteVar2.C;
        lte.m(eteVar16);
        eteVar16.W();
        contentValues.put("session_stitching_token_hash", Long.valueOf(hqeVar.w));
        q5e.a();
        t7e t7eVar = lteVar.d;
        ppe ppeVar = lteVar.f;
        if (t7eVar.i0(E2, yme.O0)) {
            ete eteVar17 = lteVar2.C;
            lte.m(eteVar17);
            eteVar17.W();
            contentValues.put("ad_services_version", Integer.valueOf(hqeVar.x));
            ete eteVar18 = lteVar2.C;
            lte.m(eteVar18);
            eteVar18.W();
            contentValues.put("attribution_eligibility_status", Long.valueOf(hqeVar.B));
        }
        ete eteVar19 = lteVar2.C;
        lte.m(eteVar19);
        eteVar19.W();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(hqeVar.y));
        contentValues.put("npa_metadata_value", hqeVar.x());
        ete eteVar20 = lteVar2.C;
        lte.m(eteVar20);
        eteVar20.W();
        contentValues.put("bundle_delivery_index", Long.valueOf(hqeVar.F));
        contentValues.put("sgtm_preview_key", hqeVar.D());
        lte.m(eteVar10);
        eteVar10.W();
        contentValues.put("dma_consent_state", Integer.valueOf(hqeVar.D));
        lte.m(eteVar10);
        eteVar10.W();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(hqeVar.E));
        contentValues.put("serialized_npa_metadata", hqeVar.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(hqeVar.t()));
        ete eteVar21 = lteVar2.C;
        lte.m(eteVar21);
        eteVar21.W();
        ArrayList arrayList = hqeVar.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                lte.m(ppeVar);
                ppeVar.E.f(E2, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        y4e y4eVar = (y4e) w4e.b.a.a;
        if (t7eVar.i0(null, yme.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        ete eteVar22 = lteVar2.C;
        lte.m(eteVar22);
        eteVar22.W();
        contentValues.put("unmatched_pfo", hqeVar.z);
        ete eteVar23 = lteVar2.C;
        lte.m(eteVar23);
        eteVar23.W();
        contentValues.put("unmatched_uwa", hqeVar.A);
        ete eteVar24 = lteVar2.C;
        lte.m(eteVar24);
        eteVar24.W();
        contentValues.put("ad_campaign_info", hqeVar.H);
        if (t7eVar.i0(E2, yme.j1)) {
            ete eteVar25 = lteVar2.C;
            lte.m(eteVar25);
            eteVar25.W();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(hqeVar.J));
        }
        try {
            SQLiteDatabase O0 = O0();
            if (O0.update("apps", contentValues, "app_id = ?", new String[]{E2}) == 0 && O0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                lte.m(ppeVar);
                ppeVar.f.f(ppe.f0(E2), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            lte.m(ppeVar);
            ppeVar.f.g(ppe.f0(E2), e, "Error storing app. appId");
        }
    }

    public final boolean d0(String str) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(new p0f[]{p0f.GOOGLE_SIGNAL}[0].a));
        String C0 = C0(arrayList);
        String B0 = B0();
        if (t0(nk2.w(new StringBuilder(C0.length() + 61 + B0.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", C0, " AND NOT ", B0), new String[]{str}) != 0) {
            return true;
        }
        return false;
    }

    public final n9e d1(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return e1(j, str, 1L, false, false, z, false, z2, z3, z4);
    }

    public final void e0(Long l) {
        lte lteVar = (lte) this.a;
        W();
        Y();
        try {
            if (O0().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.E.e("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.f.f(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n9e] */
    public final n9e e1(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        lte lteVar = (lte) this.a;
        am8.p(str);
        W();
        Y();
        String[] strArr = {str};
        ?? obj = new Object();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase O0 = O0();
                cursor = O0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    ppe ppeVar = lteVar.f;
                    lte.m(ppeVar);
                    ppeVar.E.f(ppe.f0(str), "Not updating daily counts, app is not known. appId");
                } else {
                    if (cursor.getLong(0) == j) {
                        obj.b = cursor.getLong(1);
                        obj.a = cursor.getLong(2);
                        obj.c = cursor.getLong(3);
                        obj.d = cursor.getLong(4);
                        obj.e = cursor.getLong(5);
                        obj.f = cursor.getLong(6);
                        obj.g = cursor.getLong(7);
                    }
                    if (z) {
                        obj.b += j2;
                    }
                    if (z2) {
                        obj.a += j2;
                    }
                    if (z3) {
                        obj.c += j2;
                    }
                    if (z4) {
                        obj.d += j2;
                    }
                    if (z5) {
                        obj.e += j2;
                    }
                    if (z6) {
                        obj.f += j2;
                    }
                    if (z7) {
                        obj.g += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(obj.a));
                    contentValues.put("daily_events_count", Long.valueOf(obj.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(obj.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(obj.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(obj.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(obj.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(obj.g));
                    O0.update("apps", contentValues, "app_id=?", strArr);
                }
            } catch (SQLiteException e) {
                ppe ppeVar2 = lteVar.f;
                lte.m(ppeVar2);
                ppeVar2.f.g(ppe.f0(str), e, "Error updating daily counts. appId");
            }
            if (cursor != null) {
                cursor.close();
            }
            return obj;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f0() {
        /*
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.O0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L35
            r2 = 0
            java.lang.String r4 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r4
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L25
        L1e:
            r1 = r0
            goto L3b
        L20:
            r4 = move-exception
            goto L3b
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            java.lang.Object r4 = r4.a     // Catch: java.lang.Throwable -> L1a
            lte r4 = (defpackage.lte) r4     // Catch: java.lang.Throwable -> L1a
            ppe r4 = r4.f     // Catch: java.lang.Throwable -> L1a
            defpackage.lte.m(r4)     // Catch: java.lang.Throwable -> L1a
            s56 r4 = r4.f     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "Database error getting next bundle app id"
            r4.f(r2, r3)     // Catch: java.lang.Throwable -> L1a
        L35:
            if (r0 == 0) goto L3a
            r0.close()
        L3a:
            return r1
        L3b:
            if (r1 == 0) goto L40
            r1.close()
        L40:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.f0():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ac3 f1(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.a
            r1 = r0
            lte r1 = (defpackage.lte) r1
            defpackage.am8.p(r12)
            r11.W()
            r11.Y()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.O0()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L70
            java.lang.String r4 = "apps"
            java.lang.String r11 = "remote_config"
            java.lang.String r0 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r5 = new java.lang.String[]{r11, r0, r5}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L70
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L70
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r11 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L70
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L33
            goto L83
        L33:
            r0 = 0
            byte[] r0 = r11.getBlob(r0)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r3 = 1
            java.lang.String r3 = r11.getString(r3)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r4 = 2
            java.lang.String r4 = r11.getString(r4)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            boolean r5 = r11.moveToNext()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r5 == 0) goto L5e
            ppe r5 = r1.f     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            defpackage.lte.m(r5)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            s56 r5 = r5.f     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            ope r7 = defpackage.ppe.f0(r12)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r5.f(r7, r6)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L6a
        L5c:
            r0 = move-exception
            goto L73
        L5e:
            if (r0 != 0) goto L61
            goto L83
        L61:
            ac3 r5 = new ac3     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r5.<init>(r3, r4, r0)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r11.close()
            return r5
        L6a:
            r2 = r11
            goto L89
        L6c:
            r0 = move-exception
            r11 = r0
            r12 = r11
            goto L89
        L70:
            r0 = move-exception
            r11 = r0
            r11 = r2
        L73:
            ppe r1 = r1.f     // Catch: java.lang.Throwable -> L59
            defpackage.lte.m(r1)     // Catch: java.lang.Throwable -> L59
            s56 r1 = r1.f     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "Error querying remote config. appId"
            ope r12 = defpackage.ppe.f0(r12)     // Catch: java.lang.Throwable -> L59
            r1.g(r12, r0, r3)     // Catch: java.lang.Throwable -> L59
        L83:
            if (r11 == 0) goto L88
            r11.close()
        L88:
            return r2
        L89:
            if (r2 == 0) goto L8e
            r2.close()
        L8e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.f1(java.lang.String):ac3");
    }

    public final void g0(long j) {
        W();
        Y();
        try {
            if (O0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
                return;
            }
            throw new SQLiteException("Deleted fewer rows from queue than expected");
        } catch (SQLiteException e) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.f.f(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void g1(nte nteVar, boolean z) {
        W();
        Y();
        am8.p(nteVar.t());
        am8.v(nteVar.g2());
        h0();
        lte lteVar = (lte) this.a;
        kh5 kh5Var = lteVar.G;
        ppe ppeVar = lteVar.f;
        kh5Var.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long h2 = nteVar.h2();
        wme wmeVar = yme.R;
        if (h2 < currentTimeMillis - ((Long) wmeVar.a(null)).longValue() || nteVar.h2() > ((Long) wmeVar.a(null)).longValue() + currentTimeMillis) {
            lte.m(ppeVar);
            ppeVar.E.h("Storing bundle outside of the max uploading time span. appId, now, timestamp", ppe.f0(nteVar.t()), Long.valueOf(currentTimeMillis), Long.valueOf(nteVar.h2()));
        }
        byte[] a = nteVar.a();
        try {
            e6f e6fVar = this.b.C;
            a6f.U(e6fVar);
            byte[] H0 = e6fVar.H0(a);
            lte.m(ppeVar);
            ppeVar.J.f(Integer.valueOf(H0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", nteVar.t());
            contentValues.put("bundle_end_timestamp", Long.valueOf(nteVar.h2()));
            contentValues.put("data", H0);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (nteVar.t0()) {
                contentValues.put("retry_count", Integer.valueOf(nteVar.u0()));
            }
            try {
                if (O0().insert("queue", null, contentValues) == -1) {
                    lte.m(ppeVar);
                    ppeVar.f.f(ppe.f0(nteVar.t()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                lte.m(ppeVar);
                ppeVar.f.g(ppe.f0(nteVar.t()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            lte.m(ppeVar);
            ppeVar.f.g(ppe.f0(nteVar.t()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void h0() {
        W();
        Y();
        if (I0()) {
            a6f a6fVar = this.b;
            long g = a6fVar.E.e.g();
            lte lteVar = (lte) this.a;
            lteVar.G.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - g) > ((Long) yme.M.a(null)).longValue()) {
                a6fVar.E.e.h(elapsedRealtime);
                W();
                Y();
                if (I0()) {
                    SQLiteDatabase O0 = O0();
                    lteVar.G.getClass();
                    int delete = O0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) yme.R.a(null)).longValue())});
                    if (delete > 0) {
                        ppe ppeVar = lteVar.f;
                        lte.m(ppeVar);
                        ppeVar.J.f(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void i0(ArrayList arrayList) {
        lte lteVar = (lte) this.a;
        W();
        Y();
        am8.s(arrayList);
        if (arrayList.size() != 0) {
            if (!I0()) {
                return;
            }
            String join = TextUtils.join(",", arrayList);
            String v = nk2.v(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (t0(nk2.v(new StringBuilder(v.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", v, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.E.e("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase O0 = O0();
                StringBuilder sb = new StringBuilder(v.length() + Token.SWITCH);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(v);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                O0.execSQL(sb.toString());
                return;
            } catch (SQLiteException e) {
                ppe ppeVar2 = lteVar.f;
                lte.m(ppeVar2);
                ppeVar2.f.f(e, "Error incrementing retry count. error");
                return;
            }
        }
        vs.m("Given Integer is zero");
    }

    public final void j0(Long l) {
        lte lteVar = (lte) this.a;
        W();
        Y();
        if (!I0()) {
            return;
        }
        StringBuilder sb = new StringBuilder(l.toString().length() + 86);
        sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
        sb.append(l);
        sb.append(" AND retry_count =  2147483647 LIMIT 1");
        if (t0(sb.toString(), null) > 0) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.E.e("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            SQLiteDatabase O0 = O0();
            lteVar.G.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
            sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
            sb2.append(currentTimeMillis);
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder(sb3.length() + 34 + l.toString().length() + 29);
            sb4.append("UPDATE upload_queue");
            sb4.append(sb3);
            sb4.append(" WHERE rowid = ");
            sb4.append(l);
            sb4.append(" AND retry_count < 2147483647");
            O0.execSQL(sb4.toString());
        } catch (SQLiteException e) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.f.f(e, "Error incrementing retry count. error");
        }
    }

    public final Object k0(Cursor cursor, int i) {
        lte lteVar = (lte) this.a;
        int type = cursor.getType(i);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            ppe ppeVar = lteVar.f;
                            lte.m(ppeVar);
                            ppeVar.f.f(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                            return null;
                        }
                        ppe ppeVar2 = lteVar.f;
                        lte.m(ppeVar2);
                        ppeVar2.f.e("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i);
                }
                return Double.valueOf(cursor.getDouble(i));
            }
            return Long.valueOf(cursor.getLong(i));
        }
        ppe ppeVar3 = lteVar.f;
        lte.m(ppeVar3);
        ppeVar3.f.e("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:2|3|4)|(2:6|(3:8|9|10)(1:13))|14|15|(1:17)(2:20|21)|18|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
        r0 = r0.f;
        defpackage.lte.m(r0);
        r0.f.h("Error inserting column. appId", defpackage.ppe.f0(r14), "first_open_count", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l0(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.a
            lte r0 = (defpackage.lte) r0
            java.lang.String r1 = "select first_open_count from app2 where app_id=?"
            defpackage.am8.p(r14)
            java.lang.String r2 = "first_open_count"
            defpackage.am8.p(r2)
            r13.W()
            r13.Y()
            android.database.sqlite.SQLiteDatabase r3 = r13.O0()
            r3.beginTransaction()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = 48
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r6.append(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String[] r6 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = -1
            long r9 = r13.u0(r1, r6, r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r1 = "app2"
            java.lang.String r6 = "app_id"
            if (r13 != 0) goto L72
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r13.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r13.put(r6, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r13.put(r2, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r10 = "previous_install_count"
            r13.put(r10, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            r10 = 5
            long r9 = r3.insertWithOnConflict(r1, r9, r13, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r13 != 0) goto L71
            ppe r13 = r0.f     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            defpackage.lte.m(r13)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            s56 r13 = r13.f     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = "Failed to insert column (got -1). appId"
            ope r6 = defpackage.ppe.f0(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r13.g(r6, r2, r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            goto Lbd
        L6d:
            r13 = move-exception
            goto Lc1
        L6f:
            r13 = move-exception
            goto Lac
        L71:
            r9 = r4
        L72:
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r13.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r13.put(r6, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r11 = 1
            long r11 = r11 + r9
            java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r13.put(r2, r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r6 = "app_id = ?"
            java.lang.String[] r11 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r13 = r3.update(r1, r13, r6, r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            long r11 = (long) r13     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 != 0) goto La6
            ppe r13 = r0.f     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            defpackage.lte.m(r13)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            s56 r13 = r13.f     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r1 = "Failed to update column (got 0). appId"
            ope r4 = defpackage.ppe.f0(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r13.g(r4, r2, r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            goto Lbd
        La4:
            r13 = move-exception
            goto Lab
        La6:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r7 = r9
            goto Lbd
        Lab:
            r4 = r9
        Lac:
            ppe r0 = r0.f     // Catch: java.lang.Throwable -> L6d
            defpackage.lte.m(r0)     // Catch: java.lang.Throwable -> L6d
            s56 r0 = r0.f     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "Error inserting column. appId"
            ope r14 = defpackage.ppe.f0(r14)     // Catch: java.lang.Throwable -> L6d
            r0.h(r1, r14, r2, r13)     // Catch: java.lang.Throwable -> L6d
            r7 = r4
        Lbd:
            r3.endTransaction()
            return r7
        Lc1:
            r3.endTransaction()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.l0(java.lang.String):long");
    }

    public final boolean m0(String str, String str2) {
        if (t0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0) {
            return true;
        }
        return false;
    }

    public final void n0(List list) {
        am8.s(list);
        W();
        Y();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int delete = O0().delete("raw_events", sb.toString(), null);
        if (delete != list.size()) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.f.g(Integer.valueOf(delete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final long o0(String str) {
        am8.p(str);
        return u0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void p0(String str, Long l, long j, jse jseVar) {
        W();
        Y();
        am8.s(jseVar);
        am8.p(str);
        lte lteVar = (lte) this.a;
        byte[] a = jseVar.a();
        ppe ppeVar = lteVar.f;
        ppe ppeVar2 = lteVar.f;
        lte.m(ppeVar);
        ppeVar.J.g(lteVar.F.a(str), Integer.valueOf(a.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", a);
        try {
            if (O0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                lte.m(ppeVar2);
                ppeVar2.f.f(ppe.f0(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            lte.m(ppeVar2);
            ppeVar2.f.g(ppe.f0(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a4 A[Catch: SQLiteException -> 0x02c0, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02c0, blocks: (B:94:0x0289, B:96:0x02a4), top: B:113:0x0289 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0(java.lang.String r27, java.lang.Long r28, java.lang.String r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.q0(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r3 == 0) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Type inference failed for: r3v0, types: [c3e, f5f, z9e] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hwe r0(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.a
            lte r0 = (defpackage.lte) r0
            defpackage.am8.s(r4)
            r3.W()
            r3.Y()
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r3.O0()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            android.database.Cursor r3 = r3.rawQuery(r1, r4)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            if (r4 != 0) goto L36
            ppe r4 = r0.f     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            defpackage.lte.m(r4)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            s56 r4 = r4.J     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            java.lang.String r1 = "No data found"
            r4.e(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
        L2e:
            r3.close()
            goto L5c
        L32:
            r4 = move-exception
            goto L45
        L34:
            r4 = move-exception
            goto L4d
        L36:
            r4 = 0
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            r1 = 1
            int r1 = r3.getInt(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            hwe r2 = defpackage.hwe.c(r1, r4)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            goto L2e
        L45:
            r2 = r3
            goto L62
        L47:
            r3 = move-exception
            r4 = r3
            goto L62
        L4a:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L4d:
            ppe r0 = r0.f     // Catch: java.lang.Throwable -> L32
            defpackage.lte.m(r0)     // Catch: java.lang.Throwable -> L32
            s56 r0 = r0.f     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Error querying database."
            r0.f(r4, r1)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L5c
            goto L2e
        L5c:
            if (r2 != 0) goto L61
            hwe r3 = defpackage.hwe.c
            return r3
        L61:
            return r2
        L62:
            if (r2 == 0) goto L67
            r2.close()
        L67:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.r0(java.lang.String):hwe");
    }

    public final void s0(String str, p4f p4fVar) {
        W();
        Y();
        am8.p(str);
        lte lteVar = (lte) this.a;
        kh5 kh5Var = lteVar.G;
        ppe ppeVar = lteVar.f;
        kh5Var.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        wme wmeVar = yme.u0;
        long j = p4fVar.b;
        if (j < currentTimeMillis - ((Long) wmeVar.a(null)).longValue() || j > ((Long) wmeVar.a(null)).longValue() + currentTimeMillis) {
            lte.m(ppeVar);
            ppeVar.E.h("Storing trigger URI outside of the max retention time span. appId, now, timestamp", ppe.f0(str), Long.valueOf(currentTimeMillis), Long.valueOf(j));
        }
        lte.m(ppeVar);
        ppeVar.J.e("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", p4fVar.a);
        contentValues.put("source", Integer.valueOf(p4fVar.c));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (O0().insert("trigger_uris", null, contentValues) == -1) {
                lte.m(ppeVar);
                ppeVar.f.f(ppe.f0(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            lte.m(ppeVar);
            ppeVar.f.g(ppe.f0(str), e, "Error storing trigger URI. appId");
        }
    }

    public final long t0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = O0().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                ppe ppeVar = ((lte) this.a).f;
                lte.m(ppeVar);
                ppeVar.f.g(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long u0(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = O0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                ppe ppeVar = ((lte) this.a).f;
                lte.m(ppeVar);
                ppeVar.f.g(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final String v0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = O0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return "";
            } catch (SQLiteException e) {
                ppe ppeVar = ((lte) this.a).f;
                lte.m(ppeVar);
                ppeVar.f.g(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void w0(ContentValues contentValues) {
        lte lteVar = (lte) this.a;
        try {
            SQLiteDatabase O0 = O0();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.D.f(ppe.f0("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (O0.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && O0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                ppe ppeVar2 = lteVar.f;
                lte.m(ppeVar2);
                ppeVar2.f.g(ppe.f0("consent_settings"), ppe.f0("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            ppe ppeVar3 = lteVar.f;
            lte.m(ppeVar3);
            ppeVar3.f.h("Error storing into table. key", ppe.f0("consent_settings"), ppe.f0("app_id"), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.zae x0(java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9e.x0(java.lang.String, java.lang.String, java.lang.String):zae");
    }

    public final void y0(String str, zae zaeVar) {
        Long l;
        lte lteVar = (lte) this.a;
        am8.s(zaeVar);
        W();
        Y();
        ContentValues contentValues = new ContentValues();
        String str2 = zaeVar.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", zaeVar.b);
        contentValues.put("lifetime_count", Long.valueOf(zaeVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(zaeVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(zaeVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zaeVar.g));
        contentValues.put("last_bundled_day", zaeVar.h);
        contentValues.put("last_sampled_complex_event_id", zaeVar.i);
        contentValues.put("last_sampling_rate", zaeVar.j);
        contentValues.put("current_session_count", Long.valueOf(zaeVar.e));
        Boolean bool = zaeVar.k;
        if (bool != null && bool.booleanValue()) {
            l = 1L;
        } else {
            l = null;
        }
        contentValues.put("last_exempt_from_sampling", l);
        try {
            if (O0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.f.f(ppe.f0(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.f.g(ppe.f0(str2), e, "Error storing event aggregates. appId");
        }
    }

    public final void z0(String str, String str2) {
        am8.p(str2);
        W();
        Y();
        try {
            O0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.f.g(ppe.f0(str2), e, "Error deleting snapshot. appId");
        }
    }
}
