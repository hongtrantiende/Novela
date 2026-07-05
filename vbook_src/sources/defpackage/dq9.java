package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dq9  reason: default package */
/* loaded from: classes.dex */
public final class dq9 extends jc7 {
    public final /* synthetic */ int c = 1;
    public final Context d;

    public dq9(Context context) {
        super(9, 10);
        this.d = context;
    }

    @Override // defpackage.jc7
    public final void a(it4 it4Var) {
        int i = this.c;
        Context context = this.d;
        it4Var.getClass();
        switch (i) {
            case 0:
                if (this.b >= 10) {
                    it4Var.S(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                it4Var.Q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = 0;
                    long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j = 1;
                    }
                    it4Var.o();
                    try {
                        it4Var.S(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                        it4Var.S(new Object[]{"reschedule_needed", Long.valueOf(j)});
                        sharedPreferences.edit().clear().apply();
                        it4Var.j0();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    it4Var.o();
                    try {
                        it4Var.S(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        it4Var.S(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        it4Var.j0();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public dq9(Context context, int i, int i2) {
        super(i, i2);
        this.d = context;
    }
}
