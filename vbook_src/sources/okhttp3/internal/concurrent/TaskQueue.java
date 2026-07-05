package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal._UtilJvmKt;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class TaskQueue {
    public final TaskRunner a;
    public final String b;
    public boolean c;
    public Task d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class AwaitIdleTask extends Task {
        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            throw null;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String str) {
        this.a = taskRunner;
        this.b = str;
    }

    public static void c(TaskQueue taskQueue, final String str, long j, final vt4 vt4Var, int i) {
        final boolean z;
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        taskQueue.getClass();
        str.getClass();
        vt4Var.getClass();
        taskQueue.d(new Task(str, z) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                vt4Var.invoke();
                return -1L;
            }
        }, j);
    }

    public final void a() {
        TaskRunner taskRunner = this.a;
        TimeZone timeZone = _UtilJvmKt.a;
        synchronized (taskRunner) {
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final boolean b() {
        Task task = this.d;
        if (task != null && task.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((Task) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                Task task2 = (Task) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void d(Task task, long j) {
        task.getClass();
        synchronized (this.a) {
            if (this.c) {
                boolean z = task.b;
                Logger logger = this.a.b;
                if (z) {
                    if (logger.isLoggable(Level.FINE)) {
                        TaskLoggerKt.a(logger, task, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (e(task, j, false)) {
                this.a.c(this);
            }
        }
    }

    public final boolean e(Task task, long j, boolean z) {
        String concat;
        Logger logger = this.a.b;
        task.getClass();
        TaskQueue taskQueue = task.c;
        if (taskQueue != this) {
            if (taskQueue == null) {
                task.c = this;
            } else {
                vs.k("task is in multiple queues");
                return false;
            }
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.d <= j2) {
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task, this, "already scheduled");
                    return false;
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        task.d = j2;
        if (logger.isLoggable(Level.FINE)) {
            if (z) {
                concat = "run again after ".concat(TaskLoggerKt.b(j2 - nanoTime));
            } else {
                concat = "scheduled after ".concat(TaskLoggerKt.b(j2 - nanoTime));
            }
            TaskLoggerKt.a(logger, task, this, concat);
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (((Task) obj).d - nanoTime > j) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, task);
        if (i != 0) {
            return false;
        }
        return true;
    }

    public final void f() {
        TaskRunner taskRunner = this.a;
        TimeZone timeZone = _UtilJvmKt.a;
        synchronized (taskRunner) {
            this.c = true;
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
