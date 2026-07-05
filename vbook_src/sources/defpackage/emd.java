package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: emd  reason: default package */
/* loaded from: classes.dex */
public final class emd extends yp3 {
    public final /* synthetic */ WorkDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emd(WorkDatabase_Impl workDatabase_Impl) {
        super("08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243", 24);
        this.d = workDatabase_Impl;
    }

    @Override // defpackage.yp3
    public final void a(cw9 cw9Var) {
        cw9Var.getClass();
        oue.C(cw9Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oue.C(cw9Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        oue.C(cw9Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        oue.C(cw9Var, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        oue.C(cw9Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        oue.C(cw9Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        oue.C(cw9Var, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oue.C(cw9Var, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        oue.C(cw9Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oue.C(cw9Var, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oue.C(cw9Var, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        oue.C(cw9Var, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oue.C(cw9Var, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        oue.C(cw9Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        oue.C(cw9Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // defpackage.yp3
    public final void c(cw9 cw9Var) {
        cw9Var.getClass();
        oue.C(cw9Var, "DROP TABLE IF EXISTS `Dependency`");
        oue.C(cw9Var, "DROP TABLE IF EXISTS `WorkSpec`");
        oue.C(cw9Var, "DROP TABLE IF EXISTS `WorkTag`");
        oue.C(cw9Var, "DROP TABLE IF EXISTS `SystemIdInfo`");
        oue.C(cw9Var, "DROP TABLE IF EXISTS `WorkName`");
        oue.C(cw9Var, "DROP TABLE IF EXISTS `WorkProgress`");
        oue.C(cw9Var, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // defpackage.yp3
    public final void r(cw9 cw9Var) {
        cw9Var.getClass();
    }

    @Override // defpackage.yp3
    public final void s(cw9 cw9Var) {
        boolean z;
        cw9Var.getClass();
        oue.C(cw9Var, "PRAGMA foreign_keys = ON");
        w16 f = this.d.f();
        koc kocVar = f.b;
        kocVar.getClass();
        iw9 h1 = cw9Var.h1("PRAGMA query_only");
        try {
            h1.Z0();
            if (h1.getLong(0) != 0) {
                z = true;
            } else {
                z = false;
            }
            dxe.r(h1, null);
            if (!z) {
                oue.C(cw9Var, "PRAGMA temp_store = MEMORY");
                oue.C(cw9Var, "PRAGMA recursive_triggers = 1");
                oue.C(cw9Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (kocVar.a) {
                    oue.C(cw9Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    oue.C(cw9Var, r4b.N("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", false, "TEMP", ""));
                }
                o40 o40Var = (o40) kocVar.h;
                ReentrantLock reentrantLock = (ReentrantLock) o40Var.b;
                reentrantLock.lock();
                try {
                    o40Var.a = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (f.g) {
            }
        } finally {
        }
    }

    @Override // defpackage.yp3
    public final void t(cw9 cw9Var) {
        cw9Var.getClass();
    }

    @Override // defpackage.yp3
    public final void u(cw9 cw9Var) {
        cw9Var.getClass();
        jq6 t = tl1.t();
        iw9 h1 = cw9Var.h1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (h1.Z0()) {
            try {
                t.add(h1.s0(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dxe.r(h1, th);
                    throw th2;
                }
            }
        }
        dxe.r(h1, null);
        ListIterator listIterator = tl1.r(t).listIterator(0);
        while (true) {
            y65 y65Var = (y65) listIterator;
            if (y65Var.hasNext()) {
                String str = (String) y65Var.next();
                if (r4b.Q(str, "room_fts_content_sync_", false)) {
                    oue.C(cw9Var, "DROP TRIGGER IF EXISTS ".concat(str));
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.yp3
    public final s8 v(cw9 cw9Var) {
        cw9Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new njb(1, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap.put("prerequisite_id", new njb(2, 1, "prerequisite_id", "TEXT", null, true));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new ojb("WorkSpec", "CASCADE", "CASCADE", tl1.A("work_spec_id"), tl1.A("id")));
        linkedHashSet.add(new ojb("WorkSpec", "CASCADE", "CASCADE", tl1.A("prerequisite_id"), tl1.A("id")));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new pjb("index_Dependency_work_spec_id", false, tl1.A("work_spec_id"), tl1.A("ASC")));
        linkedHashSet2.add(new pjb("index_Dependency_prerequisite_id", false, tl1.A("prerequisite_id"), tl1.A("ASC")));
        qjb qjbVar = new qjb("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        qjb l = kue.l(cw9Var, "Dependency");
        if (!qjbVar.equals(l)) {
            return new s8("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + qjbVar + "\n Found:\n" + l, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new njb(1, 1, "id", "TEXT", null, true));
        linkedHashMap2.put("state", new njb(0, 1, "state", "INTEGER", null, true));
        linkedHashMap2.put("worker_class_name", new njb(0, 1, "worker_class_name", "TEXT", null, true));
        linkedHashMap2.put("input_merger_class_name", new njb(0, 1, "input_merger_class_name", "TEXT", null, true));
        linkedHashMap2.put("input", new njb(0, 1, "input", "BLOB", null, true));
        linkedHashMap2.put("output", new njb(0, 1, "output", "BLOB", null, true));
        linkedHashMap2.put("initial_delay", new njb(0, 1, "initial_delay", "INTEGER", null, true));
        linkedHashMap2.put("interval_duration", new njb(0, 1, "interval_duration", "INTEGER", null, true));
        linkedHashMap2.put("flex_duration", new njb(0, 1, "flex_duration", "INTEGER", null, true));
        linkedHashMap2.put("run_attempt_count", new njb(0, 1, "run_attempt_count", "INTEGER", null, true));
        linkedHashMap2.put("backoff_policy", new njb(0, 1, "backoff_policy", "INTEGER", null, true));
        linkedHashMap2.put("backoff_delay_duration", new njb(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        linkedHashMap2.put("last_enqueue_time", new njb(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        linkedHashMap2.put("minimum_retention_duration", new njb(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        linkedHashMap2.put("schedule_requested_at", new njb(0, 1, "schedule_requested_at", "INTEGER", null, true));
        linkedHashMap2.put("run_in_foreground", new njb(0, 1, "run_in_foreground", "INTEGER", null, true));
        linkedHashMap2.put("out_of_quota_policy", new njb(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        linkedHashMap2.put("period_count", new njb(0, 1, "period_count", "INTEGER", "0", true));
        linkedHashMap2.put("generation", new njb(0, 1, "generation", "INTEGER", "0", true));
        linkedHashMap2.put("next_schedule_time_override", new njb(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        linkedHashMap2.put("next_schedule_time_override_generation", new njb(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
        linkedHashMap2.put("stop_reason", new njb(0, 1, "stop_reason", "INTEGER", "-256", true));
        linkedHashMap2.put("trace_tag", new njb(0, 1, "trace_tag", "TEXT", null, false));
        linkedHashMap2.put("backoff_on_system_interruptions", new njb(0, 1, "backoff_on_system_interruptions", "INTEGER", null, false));
        linkedHashMap2.put("required_network_type", new njb(0, 1, "required_network_type", "INTEGER", null, true));
        linkedHashMap2.put("required_network_request", new njb(0, 1, "required_network_request", "BLOB", "x''", true));
        linkedHashMap2.put("requires_charging", new njb(0, 1, "requires_charging", "INTEGER", null, true));
        linkedHashMap2.put("requires_device_idle", new njb(0, 1, "requires_device_idle", "INTEGER", null, true));
        linkedHashMap2.put("requires_battery_not_low", new njb(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        linkedHashMap2.put("requires_storage_not_low", new njb(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        linkedHashMap2.put("trigger_content_update_delay", new njb(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        linkedHashMap2.put("trigger_max_content_delay", new njb(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        linkedHashMap2.put("content_uri_triggers", new njb(0, 1, "content_uri_triggers", "BLOB", null, true));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new pjb("index_WorkSpec_schedule_requested_at", false, tl1.A("schedule_requested_at"), tl1.A("ASC")));
        linkedHashSet4.add(new pjb("index_WorkSpec_last_enqueue_time", false, tl1.A("last_enqueue_time"), tl1.A("ASC")));
        qjb qjbVar2 = new qjb("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        qjb l2 = kue.l(cw9Var, "WorkSpec");
        if (!qjbVar2.equals(l2)) {
            return new s8("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + qjbVar2 + "\n Found:\n" + l2, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new njb(1, 1, "tag", "TEXT", null, true));
        linkedHashMap3.put("work_spec_id", new njb(2, 1, "work_spec_id", "TEXT", null, true));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new ojb("WorkSpec", "CASCADE", "CASCADE", tl1.A("work_spec_id"), tl1.A("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new pjb("index_WorkTag_work_spec_id", false, tl1.A("work_spec_id"), tl1.A("ASC")));
        qjb qjbVar3 = new qjb("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        qjb l3 = kue.l(cw9Var, "WorkTag");
        if (!qjbVar3.equals(l3)) {
            return new s8("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + qjbVar3 + "\n Found:\n" + l3, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new njb(1, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap4.put("generation", new njb(2, 1, "generation", "INTEGER", "0", true));
        linkedHashMap4.put("system_id", new njb(0, 1, "system_id", "INTEGER", null, true));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new ojb("WorkSpec", "CASCADE", "CASCADE", tl1.A("work_spec_id"), tl1.A("id")));
        qjb qjbVar4 = new qjb("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        qjb l4 = kue.l(cw9Var, "SystemIdInfo");
        if (!qjbVar4.equals(l4)) {
            return new s8("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + qjbVar4 + "\n Found:\n" + l4, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new njb(1, 1, "name", "TEXT", null, true));
        linkedHashMap5.put("work_spec_id", new njb(2, 1, "work_spec_id", "TEXT", null, true));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new ojb("WorkSpec", "CASCADE", "CASCADE", tl1.A("work_spec_id"), tl1.A("id")));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new pjb("index_WorkName_work_spec_id", false, tl1.A("work_spec_id"), tl1.A("ASC")));
        qjb qjbVar5 = new qjb("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        qjb l5 = kue.l(cw9Var, "WorkName");
        if (!qjbVar5.equals(l5)) {
            return new s8("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + qjbVar5 + "\n Found:\n" + l5, false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new njb(1, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap6.put("progress", new njb(0, 1, "progress", "BLOB", null, true));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new ojb("WorkSpec", "CASCADE", "CASCADE", tl1.A("work_spec_id"), tl1.A("id")));
        qjb qjbVar6 = new qjb("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        qjb l6 = kue.l(cw9Var, "WorkProgress");
        if (!qjbVar6.equals(l6)) {
            return new s8("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + qjbVar6 + "\n Found:\n" + l6, false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new njb(1, 1, "key", "TEXT", null, true));
        linkedHashMap7.put("long_value", new njb(0, 1, "long_value", "INTEGER", null, false));
        qjb qjbVar7 = new qjb("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        qjb l7 = kue.l(cw9Var, "Preference");
        if (!qjbVar7.equals(l7)) {
            return new s8("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + qjbVar7 + "\n Found:\n" + l7, false);
        }
        return new s8(null, true);
    }
}
