package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x9e  reason: default package */
/* loaded from: classes.dex */
public final class x9e extends SQLiteOpenHelper {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3e b;

    public x9e(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        int i = this.a;
        c3e c3eVar = this.b;
        switch (i) {
            case 0:
                z9e z9eVar = (z9e) c3eVar;
                lte lteVar = (lte) z9eVar.a;
                ((lte) z9eVar.a).getClass();
                zg1 zg1Var = z9eVar.e;
                if (zg1Var.b != 0) {
                    ((kh5) zg1Var.c).getClass();
                    if (SystemClock.elapsedRealtime() - zg1Var.b < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((kh5) zg1Var.c).getClass();
                    zg1Var.b = SystemClock.elapsedRealtime();
                    ppe ppeVar = lteVar.f;
                    lte.m(ppeVar);
                    ppeVar.f.e("Opening the database failed, dropping and recreating it");
                    if (!lteVar.a.getDatabasePath("google_app_measurement.db").delete()) {
                        ppe ppeVar2 = lteVar.f;
                        lte.m(ppeVar2);
                        ppeVar2.f.f("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        zg1Var.b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        ppe ppeVar3 = lteVar.f;
                        lte.m(ppeVar3);
                        ppeVar3.f.f(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                toe toeVar = (toe) c3eVar;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    lte lteVar2 = (lte) toeVar.a;
                    ppe ppeVar4 = lteVar2.f;
                    lte.m(ppeVar4);
                    ppeVar4.f.e("Opening the local database failed, dropping and recreating it");
                    if (!lteVar2.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        ppe ppeVar5 = lteVar2.f;
                        lte.m(ppeVar5);
                        ppeVar5.f.f("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        ppe ppeVar6 = ((lte) toeVar.a).f;
                        lte.m(ppeVar6);
                        ppeVar6.f.f(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.a;
        c3e c3eVar = this.b;
        switch (i) {
            case 0:
                ppe ppeVar = ((lte) ((z9e) c3eVar).a).f;
                lte.m(ppeVar);
                wq9.L(ppeVar, sQLiteDatabase);
                return;
            default:
                ppe ppeVar2 = ((lte) ((toe) c3eVar).a).f;
                lte.m(ppeVar2);
                wq9.L(ppeVar2, sQLiteDatabase);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        int i = this.a;
        c3e c3eVar = this.b;
        switch (i) {
            case 0:
                lte lteVar = (lte) ((z9e) c3eVar).a;
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                wq9.J(ppeVar, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", z9e.f);
                ppe ppeVar2 = lteVar.f;
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", z9e.D);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", z9e.E);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", z9e.G);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", z9e.F);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", z9e.H);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", z9e.I);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", z9e.J);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", z9e.K);
                q5e.a();
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", z9e.L);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", z9e.C);
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                u4e u4eVar = (u4e) t4e.b.a.a;
                lte.m(ppeVar2);
                wq9.J(ppeVar2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                return;
            default:
                ppe ppeVar3 = ((lte) ((toe) c3eVar).a).f;
                lte.m(ppeVar3);
                wq9.J(ppeVar3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", toe.e);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x9e(toe toeVar, Context context) {
        this(context, "google_app_measurement_local.db");
        this.a = 1;
        this.b = toeVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x9e(z9e z9eVar, Context context) {
        this(context, "google_app_measurement.db");
        this.a = 0;
        this.b = z9eVar;
    }

    private final void C(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void G(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void o(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void q(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
