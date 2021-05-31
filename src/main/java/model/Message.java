package model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Message {
    private int message_id;
    private String message;
    private String m_author;
    private String m_date;
}
