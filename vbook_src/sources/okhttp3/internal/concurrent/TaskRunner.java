package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class TaskRunner implements Lockable {
    public static final Logger G;
    public static final TaskRunner H;
    public int C;
    public final ArrayList D;
    public final ArrayList E;
    public final TaskRunner$runnable$1 F;
    public final RealBackend a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface Backend {
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class RealBackend implements Backend {
        public final ThreadPoolExecutor a;

        public RealBackend(etd etdVar) {
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), etdVar);
        }
    }

    static {
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        logger.getClass();
        G = logger;
        H = new TaskRunner(new RealBackend(new etd(s21.q(new StringBuilder(), _UtilJvmKt.b, " TaskRunner"), true)));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [okhttp3.internal.concurrent.TaskRunner$runnable$1] */
    public TaskRunner(RealBackend realBackend) {
        Logger logger = G;
        logger.getClass();
        this.a = realBackend;
        this.b = logger;
        this.c = 10000;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                Task b;
                long j;
                Task b2;
                TaskRunner taskRunner = TaskRunner.this;
                synchronized (taskRunner) {
                    taskRunner.C++;
                    b = taskRunner.b();
                }
                if (b == null) {
                    return;
                }
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                while (true) {
                    try {
                        currentThread.setName(b.a);
                        Logger logger2 = TaskRunner.this.b;
                        TaskQueue taskQueue = b.c;
                        taskQueue.getClass();
                        boolean isLoggable = logger2.isLoggable(Level.FINE);
                        if (isLoggable) {
                            j = System.nanoTime();
                            TaskLoggerKt.a(logger2, b, taskQueue, "starting");
                        } else {
                            j = -1;
                        }
                        long a = b.a();
                        if (isLoggable) {
                            TaskLoggerKt.a(logger2, b, taskQueue, "finished run in " + TaskLoggerKt.b(System.nanoTime() - j));
                        }
                        TaskRunner taskRunner2 = TaskRunner.this;
                        synchronized (taskRunner2) {
                            TaskRunner.a(taskRunner2, b, a, true);
                            b2 = taskRunner2.b();
                        }
                        if (b2 == null) {
                            return;
                        }
                        b = b2;
                    } catch (Throwable th) {
                        try {
                            TaskRunner taskRunner3 = TaskRunner.this;
                            synchronized (taskRunner3) {
                                TaskRunner.a(taskRunner3, b, -1L, false);
                                if (th instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                    return;
                                }
                                throw th;
                            }
                        } finally {
                            currentThread.setName(name);
                        }
                    }
                }
            }
        };
    }

    public static final void a(TaskRunner taskRunner, Task task, long j, boolean z) {
        TimeZone timeZone = _UtilJvmKt.a;
        TaskQueue taskQueue = task.c;
        taskQueue.getClass();
        if (taskQueue.d == task) {
            boolean z2 = taskQueue.f;
            taskQueue.f = false;
            taskQueue.d = null;
            taskRunner.D.remove(taskQueue);
            if (j != -1 && !z2 && !taskQueue.c) {
                taskQueue.e(task, j, true);
            }
            if (!taskQueue.e.isEmpty()) {
                taskRunner.E.add(taskQueue);
                if (!z) {
                    taskRunner.e();
                    return;
                }
                return;
            }
            return;
        }
        vs.k("Check failed.");
    }

    public final Task b() {
        long j;
        Task task;
        boolean z;
        TimeZone timeZone = _UtilJvmKt.a;
        while (true) {
            ArrayList arrayList = this.E;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i = 0;
            Task task2 = null;
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Task task3 = (Task) ((TaskQueue) obj).e.get(0);
                    j = nanoTime;
                    task = null;
                    long max = Math.max(0L, task3.d - j);
                    if (max > 0) {
                        j2 = Math.min(max, j2);
                    } else if (task2 != null) {
                        z = true;
                        break;
                    } else {
                        task2 = task3;
                    }
                    nanoTime = j;
                } else {
                    j = nanoTime;
                    task = null;
                    z = false;
                    break;
                }
            }
            ArrayList arrayList2 = this.D;
            if (task2 != null) {
                TimeZone timeZone2 = _UtilJvmKt.a;
                task2.d = -1L;
                TaskQueue taskQueue = task2.c;
                taskQueue.getClass();
                taskQueue.e.remove(task2);
                arrayList.remove(taskQueue);
                taskQueue.d = task2;
                arrayList2.add(taskQueue);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return task2;
            } else if (this.d) {
                if (j2 < this.e - j) {
                    notify();
                    return task;
                }
                return task;
            } else {
                this.d = true;
                this.e = j + j2;
                try {
                    try {
                        TimeZone timeZone3 = _UtilJvmKt.a;
                        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                        if (i2 > 0) {
                            long j3 = j2 / 1000000;
                            long j4 = j2 - (1000000 * j3);
                            if (j3 > 0 || i2 > 0) {
                                wait(j3, (int) j4);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = _UtilJvmKt.a;
                        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                            ((TaskQueue) arrayList2.get(size2)).b();
                        }
                        for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                            TaskQueue taskQueue2 = (TaskQueue) arrayList.get(size3);
                            taskQueue2.b();
                            if (taskQueue2.e.isEmpty()) {
                                arrayList.remove(size3);
                            }
                        }
                    }
                } finally {
                    this.d = false;
                }
            }
        }
    }

    public final void c(TaskQueue taskQueue) {
        taskQueue.getClass();
        TimeZone timeZone = _UtilJvmKt.a;
        if (taskQueue.d == null) {
            boolean isEmpty = taskQueue.e.isEmpty();
            ArrayList arrayList = this.E;
            if (!isEmpty) {
                byte[] bArr = _UtilCommonKt.a;
                arrayList.getClass();
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            } else {
                arrayList.remove(taskQueue);
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final TaskQueue d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new TaskQueue(this, a82.j(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = _UtilJvmKt.a;
        int i = this.f;
        if (i > this.C) {
            return;
        }
        this.f = i + 1;
        TaskRunner$runnable$1 taskRunner$runnable$1 = this.F;
        taskRunner$runnable$1.getClass();
        this.a.a.execute(taskRunner$runnable$1);
    }
}
