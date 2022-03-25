package com.example.water;

import static com.example.water.R.drawable.*;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public abstract class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "foxandroid")

    <ic_launcher_background> new AlarmReceiver(ic_launcher_background);
    setContentTitle("Foxandroid Alarm Manager");
    setContentText("Subscribe for android related content")
    .setAutoCancel(true)
    .setDefault(NotificationCompat.DEFAULT_ALL)
    .setPriority(NotificationCompat.PRIORITY_HIGH);

    NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);
        int id = 0;
        notificationManagerCompat.notify(id 123,builder.build());

    }

    protected abstract NotificationCompat.Builder setContentText(String subscribe_for_android_related_content);

    protected abstract void setContentTitle(String foxandroid_alarm_manager);
}