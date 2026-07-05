package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eud  reason: default package */
/* loaded from: classes.dex */
public final class eud extends cud {
    public final /* synthetic */ TaskCompletionSource C;
    public final /* synthetic */ cud D;
    public final /* synthetic */ jtd E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eud(jtd jtdVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, cud cudVar) {
        super(taskCompletionSource);
        this.E = jtdVar;
        this.C = taskCompletionSource2;
        this.D = cudVar;
    }

    @Override // defpackage.cud
    public final void b() {
        synchronized (this.E.f) {
            try {
                jtd jtdVar = this.E;
                TaskCompletionSource taskCompletionSource = this.C;
                jtdVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new hvc(5, jtdVar, taskCompletionSource));
                if (this.E.l.getAndIncrement() > 0) {
                    this.E.b.b("Already connected to the service.", new Object[0]);
                }
                jtd.b(this.E, this.D);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
